public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void nomePessoa() {
        System.out.println(nome);
    }

    void verificarIdade(int idade) {
        if (idade >=18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
}

