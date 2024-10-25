package audiofy.modelo;

public class Musica extends Audio {
    //Acrescentar os dados de Nome do Artista e Ano de Lançamento
    private String artista;
    private int anoLancamento;


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    //Override para exibir na ficha técnica o Nome do Artista e o Ano de Lançamento da música
    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println(getArtista());
        System.out.println("Lançado em " + getAnoLancamento());
    }

}
