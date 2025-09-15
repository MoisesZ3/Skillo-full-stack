package ListaDeCarros;


import java.util.ArrayList;
import java.util.List;

public class MainCarro {
    public static void main(String[] args) {
        Carro primeiroCarro = new Carro("Volkswagen Fusca","Branco",1938);
        Carro segundoCarro = new Carro("Chevrolet Opala","Vermelho",1968);
        Carro terceiroCarro = new Carro("Honda Fit","Azul",2003);
        Carro quartoCarro = new Carro("Volkswagen Tera","Vermelho",2025);
        Carro quintoCarro = new Carro("Fiat Uno","Preto",1984);
        List<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(primeiroCarro);
        listaDeCarros.add(segundoCarro);
        listaDeCarros.add(terceiroCarro);
        listaDeCarros.add(quartoCarro);
        listaDeCarros.add(quintoCarro);

        for (Carro carro : listaDeCarros) {
            if(carro.getCor() == "Vermelho") {
                System.out.println("Carros vermelhos: " + carro);
            }
        }
    }
}


