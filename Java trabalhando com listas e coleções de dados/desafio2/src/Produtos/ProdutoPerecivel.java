package Produtos;

public class ProdutoPerecivel extends Produto {
    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "(Nome: " + getNome() + ") (Preço: "  + getPreco()  + ") (Quantidade: " + getQuantidade() + ")" + " (Validade: " + dataValidade + " - Dias)";
    }
}
