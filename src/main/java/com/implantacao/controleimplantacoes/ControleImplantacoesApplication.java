package com.implantacao.controleimplantacoes;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ControleImplantacoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleImplantacoesApplication.class, args);
	}

}
