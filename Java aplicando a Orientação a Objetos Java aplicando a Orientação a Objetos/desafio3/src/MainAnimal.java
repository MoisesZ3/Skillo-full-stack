import br.com.alura.desafio3.pets.Cachorro;
import br.com.alura.desafio3.pets.Gato;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro myDog = new Cachorro();
        Gato myCat = new Gato();

        myCat.arranharMoveis();
        myCat.emiteSom();
        myDog.abanarRabo();
        myDog.emiteSom();
    }
}
