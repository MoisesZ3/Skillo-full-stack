public class Desconto {
    public static void main(String[] args) {
        double precoOriginal =  35.98;
        double percentualDesconto = (precoOriginal * 10) / 100;
        double resultado = precoOriginal - percentualDesconto;
        System.out.printf("%.2f", resultado);
    }
}
