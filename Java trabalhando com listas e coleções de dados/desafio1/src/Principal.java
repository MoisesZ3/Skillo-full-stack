import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Enzo", 15);
//        pessoa.setNome("Enzo");
//        pessoa.setIdade(15);
        Pessoa pessoa2 = new Pessoa("Julio", 45);
//        pessoa2.setNome("Julio");
//        pessoa2.setIdade(45);
        Pessoa pessoa3 = new Pessoa("Adalberto", 80);
//        pessoa3.setNome("Adalberto");
//        pessoa3.setIdade(80);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}