public class MainProduto {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();
        meuProduto.setNome("Café: 500g");
        meuProduto.setPreco(40);

        meuProduto.fichaProduto();
        meuProduto.aplicarDesconto(25);
    }
}
