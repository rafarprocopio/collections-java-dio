package PesquisaList.CatalogoDeLivros;

public class Livro {
    //atributos

    private String titulo;
    private String autor;
    private int anoPublicacao;

    //essa parte abaixo foi criada de forma automatica, clicando na lampada de sugestões e selecionandoq Generate Constructor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //essa parte abaixo também foi ontida de forma automárica selecionando Generate Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //essa parte também foi  add de forma automatica, clicando na lâmpada de sugestões e selecionando toString 
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
    }
     
}
