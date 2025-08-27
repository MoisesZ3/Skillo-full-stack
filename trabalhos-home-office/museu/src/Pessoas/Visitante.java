package Pessoas;

import Salas.Sala;
import Salas.SalaFundadores;

import java.util.Scanner;

public class Visitante {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void explorarSala(Sala sala) {
        System.out.println("Bem vindo a " + sala.getNome());
        System.out.println(sala.getDescricao());
        sala.exibirConteudo();
    }
}
