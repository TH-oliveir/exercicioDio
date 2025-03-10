package com.tholivei.myapitest;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tholivei.myapitest.domain.Usuario;
import com.tholivei.myapitest.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

	private final UsuarioRepository usuarioRepository;

	
	public MyapiApplication(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Tiago Oliveira", "TIAGO", "123");
		Usuario u2 = new Usuario(null, "Carlos", "CAR", "123");

		// Salvar os usuários no banco de dados
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
	}
}
