public class MainContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaNova = new ContaCorrente();

        contaNova.setSaldo(2500);
        contaNova.setTarifaDoMes(10);
        System.out.println(contaNova.getSaldo());
        contaNova.sacar(100);
        System.out.println(contaNova.getSaldo());
        contaNova.cobrarTarifa();
        System.out.println(contaNova.getSaldo());


    }
}
