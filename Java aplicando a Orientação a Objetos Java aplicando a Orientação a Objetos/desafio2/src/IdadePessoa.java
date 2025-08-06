public class IdadePessoa {
    private String nome;
    private int idade;

    String getNome(String nome) {
        return nome;
    }

    int getIdade(int idade) {
        return idade;

    void verificaIdade (int idade) {
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
        return idade;
    }
}
