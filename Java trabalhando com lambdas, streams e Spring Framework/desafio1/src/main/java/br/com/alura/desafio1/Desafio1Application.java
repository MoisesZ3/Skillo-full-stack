package br.com.alura.desafio1;

import br.com.alura.desafio1.contadores.Contador;
import br.com.alura.desafio1.tarefas.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

    public Desafio1Application() throws IOException {
    }

    public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Contador contador = new Contador();
        contador.contar();

        //Como foi pedido o Gson foi adicionado na biblioteca da seguinte forma,
        //primeiro fui ate o site "mvnrepository.com" pequisei por Gson cliquei na ultima
        //versão e copiei o código de dependencia Maven na parte de baixo e com esse código
        //fui até a o arquivo "pom.xml" e o colei abaixo de <scope>test</scope> </dependency>

        Tarefa tarefa = new Tarefa("Desafios do mudulo 1 de trabalhando com lambdas, streams e Spring Framework", false, "Moisés");

        ObjectMapper mapper = new ObjectMapper();

        //mapper.writeValue(new File("tarefa.json"), tarefa);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("tarefa.json"), tarefa);
    }
}
