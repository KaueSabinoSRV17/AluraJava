import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Fazer conexão HTtP get para pegar os dados do IMDB
        String url = "https://api.mocki.io/v2/549a5d8b/MostPopularTVs";
        URI endereco =  URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        // extrair apenas os dados necessários (titulo, imagem e classificação)
        List<Map<String, String>> filmes = JsonParser.parse(body);
        // mostrar e manipular estes dados
        for (Map<String, String> filme : filmes) {
            System.out.println(filme.get("title"));
            System.out.println(filme.get("imDbRating"));
            System.out.println();
        }
    }
}
