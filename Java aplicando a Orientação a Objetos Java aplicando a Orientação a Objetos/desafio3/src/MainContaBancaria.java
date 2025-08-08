import br.com.alura.desafio3.banco.ContaCorrente;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaNova = new ContaCorrente();
        contaNova.setNomeUsuario("Robertinho");
        contaNova.setNumeroDaConta(234656);
        contaNova.setSaldo(2500);
        contaNova.setSaldoContaCorrente(contaNova.getSaldo());

        contaNova.consultarSaldo();
        contaNova.sacar(100);
        contaNova.consultarSaldo();
    }
}