package audiofy.modelo;

public class Episodio extends Podcast {
    private String nomeEpisodio;
    private int numeroEpisodio;
    private int temporada;
    private int duracaoEpisodio;
    private String podcast;

    public String getPodcast() {
        return podcast;
    }

    public void setPodcast(String podcast) {
        this.podcast = podcast;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("****************************************");
        System.out.println(nomeEpisodio);
        System.out.println("Episódio nº" + numeroEpisodio);
        System.out.println("Do "+ podcast);
        System.out.println(getAutor());
        System.out.println(getDuracaoEpisodio() + " minutos");
        System.out.println("Uma produção " + getProdutora());
        System.out.println("****************************************");
    }
}
