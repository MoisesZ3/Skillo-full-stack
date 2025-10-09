package br.com.alura.desafio1.contadores;

import java.util.Scanner;

public class Contador {

    public void contar() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha um número e vamo contar até ele!");
        int numeroEscolhido = leitura.nextInt();
        int numero = 0;
        while(numero != numeroEscolhido) {
            numero++;
            System.out.println(numero);
        }
    }
}
