package Ex02Streamflix.Conteudos;

public class Conteudo {
    protected String titulo;
    protected int duracaoMinutos;
    protected int anoLancamento;
    protected int classificacaoEtaria;
    protected int avaliacao;

    public Conteudo(String titulo, int duracaoMinutos, int anoLancamento, int classificacaoEtaria, int avaliacao) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.anoLancamento = anoLancamento;
        this.classificacaoEtaria = classificacaoEtaria;
        this.avaliacao = avaliacao;
    }

    public int calcularDuracaoTotal() {
        return this.duracaoMinutos;
    }

    public void reproduzir() {
        System.out.println("A reproduzir conteúdo: " + this.titulo);
    }

    public void exibirDetalhes() {
        System.out.println(this.titulo + " | " + this.anoLancamento + " | PG: " + this.classificacaoEtaria + " | Rating: " + this.avaliacao + "/10");
    }
}
