package Salas;

public class SalaFundadores extends Sala{

    @Override
    public void exibirConteudo() {
        System.out.println("""
                James Gosling:
                
                Em 1984, Gosling juntou-se à Sun Microsystems como desenvolvedor de software.
                
                Foi nessas funções que lhe ocorreu a ideia de desenvolver uma linguagem de
                programação que tornasse o programa independente da arquitetura de hardware.
                
                Inicialmente, o projeto seria utilizado para operar a televisão por cabo,
                e assim funcionar eficientemente em várias televisões,
                mas o desenvolvimento da rede de Internet fez com que a nova linguagem
                se estendesse e ganhasse popularidade, convertendo-se numa das linguagens
                de programação mais populares e importantes. Inicialmente chamava-se Oak,
                em homenagem à árvore que ficava em frente à janela do escritório de Gosling,
                mas quando se descobriu que o nome estava registado, começou-se a trabalhar
                na criação de um nome novo e inspirador. Entre as propostas surgiram, entre outras,
                Silk e Java, tendo no final sido escolhido Java,
                provavelmente inspirado na chávena de café na mesa durante a sessão de brainstorming.
                """);
        System.out.println("""
                Sun Microsystems:
                
                fundada em 1982, destacou-se no mercado de estações de trabalho e servidores por adotar o sistema UNIX e defender padrões abertos.
                Essa visão, resumida no lema de Scott McNealy — “the network is the computer” — levou a empresa a investir fortemente em soluções de interoperabilidade.
                
                Em 1995, a Sun lançou a linguagem de programação Java, criada para resolver o problema da compatibilidade entre diferentes sistemas.
                O conceito era “escreva uma vez, execute em qualquer lugar”, possibilitado pela Java Virtual Machine (JVM).
                Assim, um programa escrito em Java poderia rodar em UNIX, Windows, Macintosh e até navegadores da época, como Netscape Navigator e Internet Explorer.
                
                O sucesso do Java fez dele uma das principais linguagens para desenvolvimento de aplicações voltadas à Internet e abriu caminho para sua adoção em dispositivos móveis,
                sistemas embarcados, PDAs e até celulares da Motorola no final dos anos 1990.
                
                Apesar de conflitos com a Microsoft — que tentou lançar uma versão incompatível da JVM — a Sun consolidou o Java como referência de portabilidade.
                Em 2006, a empresa deu um passo importante ao tornar o Java open-source, reforçando seu compromisso com a comunidade de desenvolvedores.
                
                A influência da Sun também se estendeu a softwares livres, como o OpenOffice e o banco de dados MySQL,
                mas foi o Java que marcou de forma definitiva sua contribuição para a computação moderna.
                
                Em 2010, a Sun foi adquirida pela Oracle, que manteve o Java como uma de suas principais plataformas.\n
                """);
    }
}
