public class MainCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setMarca("Chevrolet");
        meuCarro.setModelo("Montana RS");
        meuCarro.setAnoDeLancamento(2023);
        meuCarro.setPrecoPrimeiroAno(151.890);
        meuCarro.setPrecoSegundoAno(156.210);
        meuCarro.setPrecoTerceiroAno(159.900);

        meuCarro.exibirFichaCarro();
        meuCarro.exibirMenorPreco();
        meuCarro.exibirMaiorPreco();
    }
}
