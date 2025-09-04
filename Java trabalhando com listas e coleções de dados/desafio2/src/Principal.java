import Produtos.Produto;
import Produtos.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Escova", 9.99, 10);
        Produto produto2 = new Produto("Lapis", 1.50, 20);
        Produto produto3 = new Produto("Caderno", 20, 2);
        Produto produto4 = new Produto("Sabonete",4.59 , 5);
        Produto produto5 = new Produto("Armario", 359.99, 1);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Maça", 1, 15, 20);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        listaDeProdutos.add(produto5);
        listaDeProdutos.add(produtoPerecivel);

        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(4));
        System.out.println(listaDeProdutos);
        System.out.println(listaDeProdutos.get(5));
    }
}