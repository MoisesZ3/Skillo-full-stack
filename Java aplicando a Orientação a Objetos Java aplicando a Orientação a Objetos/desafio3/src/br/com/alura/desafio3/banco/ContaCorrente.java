package br.com.alura.desafio3.banco;

public class ContaCorrente extends ContaBancaria {
    private double saldoContaCorrente;

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public void cobrarTarifa(double tarifa) {
        saldoContaCorrente -= tarifa;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldoContaCorrente);
    }

    @Override
    public void sacar(double saque) {
        saldoContaCorrente -= saque;
    }

    @Override
    public void depositar(double deposito) {
        saldoContaCorrente += deposito;
    }
}
