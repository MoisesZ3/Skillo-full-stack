package ListaDeProdutos;

import java.util.ArrayList;
import java.util.Comparator;

public class MainProduto {
    public static void main(String[] args) {
        Produto primeiroProduto = new Produto("Martelo", 12.50);
        Produto segundoProduto = new Produto("Parafusadeira",759.99);
        Produto teiceiroProduto = new Produto("Chave de fenda", 10);
        Produto quartoProduto = new Produto("Alicate", 15);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(primeiroProduto);
        listaProdutos.add(segundoProduto);
        listaProdutos.add(teiceiroProduto);
        listaProdutos.add(quartoProduto);

        System.out.println("Total de produtos: " + listaProdutos.size());
        listaProdutos.sort(Comparator.comparing(Produto::getPreco).reversed());
        System.out.println(listaProdutos.get(0));

    }
}