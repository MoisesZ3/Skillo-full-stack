package ListaDeViagens;

import java.util.ArrayList;
import java.util.List;

public class MainViagem {
    public static void main(String[] args) {
        Viagem primeiraViagem = new Viagem("Rio de Janeiro",5);
        Viagem segundaViagem = new Viagem("Fernando de Noronha",6);
        Viagem terceiraViagem = new Viagem("Chapada Diamantina",7);
        Viagem quartaViagem = new Viagem("Manaus",6);
        List<Viagem> listaDeViagens = new ArrayList<>();
        listaDeViagens.add(primeiraViagem);
        listaDeViagens.add(segundaViagem);
        listaDeViagens.add(terceiraViagem);
        listaDeViagens.add(quartaViagem);

        for (Viagem viagem : listaDeViagens) {
            if(viagem.getDuracaoEmDias() >= 7) {
                System.out.println(viagem);
            }
        }
    }
}
