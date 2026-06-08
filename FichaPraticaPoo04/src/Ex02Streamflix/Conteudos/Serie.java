package Ex02Streamflix.Conteudos;

import Ex02Streamflix.Enums.Genero;

public class Serie extends Entretenimento {

    private int numeroTemporadas;
    private int episodiosTemporada;
    private int duracaoMediaEpisodio;

    public Serie(String titulo, int duracaoMinutos, int anoLancamento, int classificacaoEtaria, int avaliacao, Genero genero, int numeroTemporadas, int episodiosTemporada, int duracaoMediaEpisodio) {
        super(titulo, duracaoMinutos, anoLancamento, classificacaoEtaria, avaliacao, genero);
        this.numeroTemporadas = numeroTemporadas;
        this.episodiosTemporada = episodiosTemporada;
        this.duracaoMediaEpisodio = duracaoMediaEpisodio;
    }

    @Override
    public int calcularDuracaoTotal() {
        return this.numeroTemporadas * this.episodiosTemporada * this.duracaoMediaEpisodio;
    }

    @Override
    public void reproduzir() {
        System.out.println("A reproduzir série: " + this.titulo);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(this.genero + " | Temporadas: " + this.numeroTemporadas);
    }
}
