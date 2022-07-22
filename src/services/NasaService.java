package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.Conteudo;
import parsers.JsonParser;

public class NasaService implements IContentExtractors {
    // Coleta apenas títulos e urls de imagens a partir do JSON
        public List<Conteudo> extractDataFromJson(String json) {
            // O resultado do método parse é um mapa com chaves e valores
                List<Map<String, String>> atributos = JsonParser.parse(json);
            // Lista vazia para armazenar os dados
                List<Conteudo> conteudos = new ArrayList<>();
            // Criaremos um objeto Conteudo para cada atributo
                for (Map<String, String> atributo : atributos) {
                    // O resultado destes gets serão os parâmetros que constroem um novo Conteudo
                        var conteudo = new Conteudo (
                            atributo.get("title"),
                            atributo.get("url")
                        );
                    // A cada iteração do for, vamos adicionar o conteudo para a lista
                        conteudos.add(conteudo);
                }
            // Retorno da lista de conteúdos
                return conteudos;
        }
}
