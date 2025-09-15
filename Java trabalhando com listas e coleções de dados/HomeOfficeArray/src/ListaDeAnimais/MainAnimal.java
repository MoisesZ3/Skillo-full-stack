package ListaDeAnimais;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {
        Animal primeiroAnimal = new Animal("Bilu","Cachorro");
        Animal segundoAnimal = new Animal("Duque","Gato");
        Animal terceiroAnimal = new Animal("Porco","Porco");
        Animal quartooAnimal = new Animal("Jefferson","Gato");
        List<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(primeiroAnimal);
        listaDeAnimais.add(segundoAnimal);
        listaDeAnimais.add(terceiroAnimal);
        listaDeAnimais.add(quartooAnimal);

        for (Animal animal : listaDeAnimais) {
            if(animal.getEspecie() == "Gato") {
                System.out.println("Isso é um gato: " + animal);
            }
        }
    }
}
