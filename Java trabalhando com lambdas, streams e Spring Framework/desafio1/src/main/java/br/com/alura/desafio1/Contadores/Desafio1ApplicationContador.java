package br.com.alura.desafio1.Contadores;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Desafio1ApplicationContador implements CommandLineRunner {

    public Desafio1ApplicationContador() throws IOException {
    }

    public static void main(String[] args) {
		SpringApplication.run(Desafio1ApplicationContador.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Contador contador = new Contador();
        contador.contar();

        //Como foi pedido o Gson foi adicionado na biblioteca da seguinte forma,
        //primeiro fui ate o site "mvnrepository.com" pequisei por Gson cliquei na ultima
        //versão e copiei o código de dependencia Maven na parte de baixo e com esse código
        //fui até a o arquivo "pom.xml" e o colei abaixo de <scope>test</scope> </dependency>

    }
}
