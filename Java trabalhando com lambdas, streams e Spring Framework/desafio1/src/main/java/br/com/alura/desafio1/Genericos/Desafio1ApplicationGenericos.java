package br.com.alura.desafio1.Genericos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.time.LocalDate;
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
        Assinatura streaming = new Assinatura("Netflix", 20.0, LocalDate.of(2025, 7, 10));

        double nota = leitura.nextDouble();
        String comentario = leitura.nextLine();
        Avaliacao<Assinatura> Avaliacao = new Avaliacao<Assinatura>(streaming, nota, comentario );

    }
}
