import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainAPICoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aqui você pode pesquiser suas moedas digitais:");
        String busca = scanner.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=" + busca + "&x_cg_demo_api_key=CG-dmdDGUrtiXAEth6Xr8Wvtp1v"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

