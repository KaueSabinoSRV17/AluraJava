package controllers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Controller {
    // Método Get para consumir uma API qualquer, com uma url recebida por um parâmetro
        public static String consumeApi(String url) throws Exception {
            // Nele, devemos ter uma URI, gerada através de uma URL..
                URI endereco =  URI.create(url);
            // Uma variável request, do tipo HttpRequest, "instanciada" pelo método newBuilder recebendo a URI como parâmetro
            // logo em seguida se chama um método referente ao verbo HTTP desejado e o seu respectivo método build...
                HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
            // Uma variável client, do tipo HttpClient, "instanciada" pelo método newHttpClient. usaremos apenas o método send
                HttpClient client = HttpClient.newHttpClient();
            // Uma variável response, do tipo HttpResponse de Strings. O método send recebe a resquest e o resultado de algum método do Objeto BodyHandlers                
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            // Devemos usar o método body da response para conseguir o conteúdo desejado;
                return response.body();
        }
}
