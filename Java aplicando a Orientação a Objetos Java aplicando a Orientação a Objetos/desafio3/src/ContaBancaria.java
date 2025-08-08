public class ContaBancaria {
    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }
}
