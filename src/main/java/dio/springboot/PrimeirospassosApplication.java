package dio.springboot;

import dio.springboot.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirospassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirospassosApplication.class, args);
		
		//dessa forma esses objetos não estão disponiveis no contexto sprintboot
		//não deve ser realizado new de objetos em springboot
		//quem prove esses mecanismos é o springboot
		// Calculadora calculadora = new Calculadora();
		// int soma = calculadora.somar(5, 5);
		// System.out.println(soma);
	}
	
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}
}
