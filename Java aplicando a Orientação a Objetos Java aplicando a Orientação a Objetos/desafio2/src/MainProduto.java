public class MainProduto {
    public static void main(String[] args) {
        Produto primeiroProduto = new Produto();
        primeiroProduto.setNome("Mario");
        primeiroProduto.setPreco(39.99);

        primeiroProduto.fichaProduto();
        primeiroProduto.aplicarDesconto(10.5);
    }
}

