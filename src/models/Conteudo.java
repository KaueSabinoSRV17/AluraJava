package models;

public class Conteudo {
    // Atributos de todo conteúdo que podemos consumir abstraídos: o que queremos, independete da API, é título e imagem. os valores que representam estes titulos e url serão diferentes para cada API, mas são, por definição, um título e uma url
        private String titulo;
        private String urlImagem;
    // Construtor. este Método permite criar um método de forma mais prática do que os Setters
        public Conteudo (String titulo, String urlImagem) {
            this.titulo = titulo;
            this.urlImagem = urlImagem;
        }
    // Getters. Não será necessário setters!
        public String getUrlImagem() {
            return urlImagem;
        }
        public String getTitulo() {
            return titulo;
        }
    // To String. Jeito mais elegante de mostrá-lo
        public String toString() {
            return "Título: " + this.titulo + "Imagem: " + this.urlImagem;
        }
}
