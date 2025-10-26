package br.com.alura.desafio1.Genericos;

import java.time.LocalDate;
import java.util.Date;

public class Assinatura {
    private String nome;
    private double mensalidade;
    private LocalDate dataVencimento;

    public Assinatura(String nome, double mensalidade, LocalDate dataVencimento) {
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.dataVencimento = dataVencimento;
    }
}
