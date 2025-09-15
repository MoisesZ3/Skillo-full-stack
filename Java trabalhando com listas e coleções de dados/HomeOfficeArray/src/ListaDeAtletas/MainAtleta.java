package ListaDeAtletas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainAtleta {
    public static void main(String[] args) {
        Atleta primeiroAtleta = new Atleta("Oliver","Salto com vara",9);
        Atleta segundoAtleta = new Atleta("Jefferson","Salto com vara",6);
        Atleta terceiroAtleta = new Atleta("Lucas","Salto com vara",5);
        Atleta quartoAtleta = new Atleta("Jhon","Salto com vara",10);
        List<Atleta> listaDeAtletas = new ArrayList<>();
        listaDeAtletas.add(primeiroAtleta);
        listaDeAtletas.add(segundoAtleta);
        listaDeAtletas.add(terceiroAtleta);
        listaDeAtletas.add(quartoAtleta);

        listaDeAtletas.sort(Comparator.comparing(Atleta::getPontuacao).reversed());
        System.out.println("Campeão: " + listaDeAtletas.get(0));
    }
}
