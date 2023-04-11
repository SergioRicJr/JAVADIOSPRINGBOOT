package dio.springboot;

import org.springframework.stereotype.Component;
//classe Calculadora virou um componente, objeto gereniado pelo spring
//somente os componentes não podem usar new
//demais objetos da aplicação podem ser instanciados pela aplicacao

@Component
public class Calculadora {
    public int somar(int n1, int n2) {
        return (n1+n2);
    }
}
