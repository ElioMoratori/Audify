package audiofy.modelo;

public class Podcast extends Audio {
    private String autor;
    private String produtora;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    // Duração do podcast é mais relevante ter duração dos episódios individuais. Fazer um Override para não exibir.


    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Autor: " + getAutor());
        System.out.println("Uma produção: " + getProdutora());
    }
}
