import br.com.alura.desafio4.sextodesafio.Produto;
import br.com.alura.desafio4.sextodesafio.Servico;

public class Principal {
    public static void main(String[] args) {
//        br.com.alura.desafio4.primeirodesafio.ConversorMoeda dinheiro = new br.com.alura.desafio4.primeirodesafio.ConversorMoeda();
//        System.out.println(dinheiro.converterDolarParaReal(2));
//
//        br.com.alura.desafio4.segundodesafio.CalculadoraSalaRetangular salaRetangular = new br.com.alura.desafio4.segundodesafio.CalculadoraSalaRetangular();
//        System.out.println(salaRetangular.calcularArea(5,5));
//        System.out.println(salaRetangular.calcularPerimetro(10,10));
//
//        br.com.alura.desafio4.terceirodesafio.TabuadaMultiplicacao novaTabuada = new br.com.alura.desafio4.terceirodesafio.TabuadaMultiplicacao();
//        novaTabuada.mostrarTabuada(5);
//
//        br.com.alura.desafio4.quartodesafio.ConversorTemperaturaPadrao conversao = new br.com.alura.desafio4.quartodesafio.ConversorTemperaturaPadrao();
//        conversao.celsiusParaFahrenheit(79);
//        conversao.fahrenheitParaCelsius(79);
//
//        br.com.alura.desafio4.quintodesafio.ProdutoFisico produto = new br.com.alura.desafio4.quintodesafio.ProdutoFisico();
//        System.out.println(produto.calcularPrecoFinal(90));
//
//        br.com.alura.desafio4.quintodesafio.Livro harryPotter = new br.com.alura.desafio4.quintodesafio.Livro();
//        System.out.println(harryPotter.calcularPrecoFinal(120));
//
//        Produto carroBrinquedo = new Produto();
//        carroBrinquedo.setQuantidadeDeProdutos(100);
//        carroBrinquedo.setPrecoBruto(20);
//
//        System.out.println(carroBrinquedo.calcularPrecoFinal());

        Servico pobleFlix = new Servico();
        pobleFlix.setContaPremion(true);
        pobleFlix.setPrecoBruto(20);

        System.out.println(pobleFlix.calcularPrecoFinal());
    }
}