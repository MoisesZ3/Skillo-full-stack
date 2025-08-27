package Salas;

public class SalaCuriosidades extends Sala{

    @Override
    public void exibirConteudo() {
        System.out.println("""
                Aqui estão algumas curiosidades sobre Java:
                
                1- O nome "Java" foi escolhido como referência ao café da ilha de Java (Indonésia),
                   pois os criadores da linguagem consumiam muito café durante o desenvolvimento.
                   Por isso o símbolo da linguagem é uma xícara de café.
                
                2- Um dos pilares do design do Java é a sua portabilidade.
                   O slogan "Escreva uma vez, execute em qualquer lugar"
                   significa que o código Java pode ser executado em qualquer dispositivo
                   ou sistema operacional que possua uma Java Virtual Machine (JVM).
                
                3- Linguagens como C#, Scala, Kotlin, Groovy e até parte da sintaxe de linguagens modernas
                   foram influenciadas diretamente por Java, especialmente em sua abordagem orientada a objetos.
                """);
    }
}
