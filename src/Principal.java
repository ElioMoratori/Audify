import audiofy.modelo.Episodio;
import audiofy.modelo.Musica;
import audiofy.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        //Primeiro, vou cadastrar uma nova música:
        Musica musica = new Musica();
        //Setar Titulo, Duração, Ano de Lançamento, Artista, Reproduções, Avaliação
        musica.setTitulo("Uptown Funk");
        musica.setArtista("Mark Ronson & Bruno Mars");
        musica.setDuracao(3);
        musica.setAnoLancamento(2015);
        musica.setReproducao(5000);
        musica.setAvaliacao(10);
        //Visualizando a ficha técnica da música.
        musica.exibeFichaTecnica();

        //Como fazer o campo "musica" dinâmico? Puxando de uma lista de músicas.

        //Configurando o Podcast - que é um programa:
        Podcast podcast = new Podcast();
        podcast.setTitulo("Nerdcast");
        podcast.setAutor("Alexandre Ottoni e Deive Pazzos");
        podcast.setProdutora("Jovem Nerd");
        podcast.setReproducao(1200);
        podcast.setAvaliacao(8);


        podcast.exibeFichaTecnica();

        // Configurando um episódio de podcast
        Episodio episodio = new Episodio();

        episodio.setPodcast(podcast.getTitulo());
        episodio.setDuracaoEpisodio(60);
        episodio.setNumeroEpisodio(592);
        episodio.setNomeEpisodio("Poder!");
        episodio.setProdutora(podcast.getProdutora());
        episodio.setAutor(podcast.getAutor());

        episodio.exibeFichaTecnica();

    }
}
