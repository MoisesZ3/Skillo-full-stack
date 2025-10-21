package br.com.alura.desafio1.Tarefas;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class Desafio1ApplicationTarefa implements CommandLineRunner {

    public Desafio1ApplicationTarefa() throws IOException {
    }

    public static void main(String[] args) {
		SpringApplication.run(Desafio1ApplicationTarefa.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Tarefa tarefa = new Tarefa("Desafios do mudulo 1 de trabalhando com lambdas, streams e Spring Framework", false, "Moisés");

        ObjectMapper mapper = new ObjectMapper();

        File json = new File("tarefa.json");
        //mapper.writeValue(json, tarefa);
        mapper.writerWithDefaultPrettyPrinter().writeValue(json, tarefa);

        Tarefa jsonConvertido = mapper.readValue(json, Tarefa.class);
        System.out.println(jsonConvertido);
    }
}
