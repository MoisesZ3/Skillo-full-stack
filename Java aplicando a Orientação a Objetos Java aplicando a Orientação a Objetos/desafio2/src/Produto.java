public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void fichaProduto() {
        System.out.println(getNome());
        System.out.println("Preco do produto: " + getPreco());
    }

    public void aplicarDesconto(double percentual) {
        double desconto =(preco * (percentual / 100));
        double precoComDesconto = preco - desconto;
        System.out.println("Preco com desconto: " + precoComDesconto);
    }
}
