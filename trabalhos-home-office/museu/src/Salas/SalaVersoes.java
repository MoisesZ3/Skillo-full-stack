package Salas;

public class SalaVersoes extends Sala {

    @Override
    public void exibirConteudo() {
        System.out.println("""
                Java 1.0:
                A primeira versão foi lançada em janeiro de 1996 e incluía as principais características da linguagem,como orientação a objetos,\s
                tratamento de exceções, manipulação de threads e uma biblioteca básica (API) para desenvolvimento de aplicativos.
                
                Java 5:
                Conhecido como Java 1.5 e lançada em 2004, foi uma das maiores evoluções da linguagem.
                Onde foram adicionados os recursos;
                *Generics (tipos genéricos) para permitir a criação de classes e métodos parametrizados;
                *Suporte a anotações (annotations) para fornecer metadados ao código;
                *Tipos enumerados (enum);
                *Classes java.util.concurrent, para programação concorrente;
                *AutoBox and Unbox, que permitiu conversões de tipos de dados primitivos para seus objetos equivalentes,
                 e vice-versa, de forma automática.
                
                Java 8:
                Lançada em 2014, trouxe uma das maiores mudanças na história da linguagem.
                Foram adicionados recursos;
                Expressões lambda, que permitem escrever código funcionalmente orientado de forma mais concisa.
                
                Java 17:
                Lançada em 2021, ela trouxe melhorias e novas funcionalidades à API de concorrência,
                como o método "orElseThrow" para tratamento de exceções em CompletableFuture e
                melhorias no desempenho da classe ThreadLocalRandom.
                
                Java 21:
                Lançada e, 2023 introduziu os threads virtuais, oferecendo mapeamento entre threads virtuais e threads do sistema operacional,\s
                permitindo a criação teoricamente ilimitada de threads virtuais.
                Essa inovação aborda as limitações dos modelos tradicionais de threading,
                permitindo a criação de inúmeras threads para atender às demandas de aplicações de servidor de alto rendimento.
                """);
    }
}
