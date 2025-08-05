public class MainCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Kwid";
        meuCarro.cor = "Branco";
        meuCarro.ano = 2017;

        meuCarro.exibeFichaTecnica();
        System.out.println("Idade do Carro: " + meuCarro.idadeDoCarro() + " anos");
    }
}
