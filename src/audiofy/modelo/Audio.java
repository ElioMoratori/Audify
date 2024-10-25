// Essa classe será a superclasse que englobará Musicas e Podcasts.

package audiofy.modelo;

public class Audio {
    private String titulo;
    private double duracao; //em minutos
    private int reproducao; // numero de reproduções
    //Avaliação deverá retornar em estrelas (usar uma interface?)
    private int avaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getReproducao() {
        return reproducao;
    }

    public void setReproducao(int reproducao) {
        this.reproducao = reproducao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void exibeFichaTecnica() {
        System.out.println("****************************************");
        System.out.println("Título: "+ getTitulo());
        System.out.println(getReproducao() + " reproduções");
        System.out.println(getDuracao() + " minutos");
        System.out.println("Nota: " + getAvaliacao());
    }

}
