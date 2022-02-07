package daw.anavarrete.m7nivell2anavarrete;

import daw.anavarrete.m7nivell2anavarrete.controllers.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class m7nivell2anavarreteApplication{

	public static void main(String[] args) {
		SpringApplication.run(m7nivell2anavarreteApplication.class, args);
		//SpringApplication.run(HelloWorld.class, args);
	}

}
