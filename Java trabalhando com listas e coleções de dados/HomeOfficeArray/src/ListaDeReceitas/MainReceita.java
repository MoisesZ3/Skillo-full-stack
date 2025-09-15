package ListaDeReceitas;

import java.util.ArrayList;
import java.util.List;

public class MainReceita {
    public static void main(String[] args) {
        Receita primeraReceira = new Receita("Chester assado",40);
        Receita segundaReceira = new Receita("Ceviche de tilápia",60);
        Receita terceiraReceira = new Receita("Strogonoff de frango",30);
        Receita quartaReceira = new Receita("Macarrão alho e óleo",15);
        List<Receita> listaDeReceitas = new ArrayList<>();

        listaDeReceitas.add(primeraReceira);
        listaDeReceitas.add(segundaReceira);
        listaDeReceitas.add(terceiraReceira);
        listaDeReceitas.add(quartaReceira);

        for (Receita receita : listaDeReceitas) {
            if(receita.getTempoDePreparo() >= 30) {
                System.out.println(receita);
            }
        }
    }
}
