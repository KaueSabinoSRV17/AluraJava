package services;

import models.Conteudo;
import java.util.List;

public interface IContentExtractors {
    public List<Conteudo> extractDataFromJson(String json);
}
