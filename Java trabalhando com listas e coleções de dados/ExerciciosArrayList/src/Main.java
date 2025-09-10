import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto primeiroProduto = new Produto("Marreta", 35);
        Produto segundoProduto = new Produto("Tesoura",4.59);
        Produto terceiroProduto = new Produto("Prato",5.99);
        Produto quartoProduto = new Produto("Lápis",1.50);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(primeiroProduto);
        listaDeProdutos.add(segundoProduto);
        listaDeProdutos.add(terceiroProduto);
        listaDeProdutos.add(quartoProduto);

        System.out.println(listaDeProdutos);
    }
}