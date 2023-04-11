package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//nesta classe seus objetos serao beans
//beans sao objetos gerenciados pelo spring
@Component
public class MyApp implements CommandLineRunner{
    //Aqui diz que quando iniciar cria um componente calculadora q depende de obj calculadora que executa o metodo
    @Autowired //vai entender que o container quando for inicializado depende de caluladora 
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculadora.somar(2, 5));
    }
    
} 
