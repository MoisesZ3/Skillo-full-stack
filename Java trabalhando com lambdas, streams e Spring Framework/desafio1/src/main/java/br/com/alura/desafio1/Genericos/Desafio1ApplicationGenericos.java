package br.com.alura.desafio1.Genericos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class Desafio1ApplicationGenericos implements CommandLineRunner {

    public Desafio1ApplicationGenericos() throws IOException {
    }

    public static void main(String[] args) {
		SpringApplication.run(Desafio1ApplicationGenericos.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Scanner leitura = new Scanner(System.in);

    }
}
