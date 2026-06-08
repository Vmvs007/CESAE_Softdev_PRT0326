package Ex02Streamflix.Conteudos;

public class Concerto extends Conteudo {

    private String pais;
    private String recinto;
    private String artista;

    public Concerto(String titulo, int duracaoMinutos, int anoLancamento, int classificacaoEtaria, int avaliacao, String pais, String recinto, String artista) {
        super(titulo, duracaoMinutos, anoLancamento, classificacaoEtaria, avaliacao);
        this.pais = pais;
        this.recinto = recinto;
        this.artista = artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("A reproduzir concerto: " + this.titulo);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(this.pais + " | " + this.recinto + " | " + this.artista);
    }
}
