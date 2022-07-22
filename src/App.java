import java.util.List;

import controllers.Controller;
import services.NasaService;
import models.Conteudo;

public class App {
    public static void main(String[] args) throws Exception {
        // Injeção de depedência da Service
            NasaService nasaService = new NasaService();
        // Chama Controller, que vai fazer as coisas de forma mais coesa
            String body = Controller.consumeApi("https://api.mocki.io/v2/549a5d8b/NASA-APOD-JamesWebbSpaceTelescope");
        // extrair apenas os dados necessários (titulo, imagem e classificação)
            List<Conteudo> lista = nasaService.extractDataFromJson(body);
        // mostrar e manipular estes dados
            System.out.println(lista.toString());
    }
}
