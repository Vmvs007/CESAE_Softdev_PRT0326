package Ex02Streamflix.Conteudos;

import Ex02Streamflix.Enums.EntidadePromotora;

public class Documentario extends Conteudo {

    private EntidadePromotora entidadePromotora;
    private String tema;

    public Documentario(String titulo, int duracaoMinutos, int anoLancamento, int classificacaoEtaria, int avaliacao, EntidadePromotora entidadePromotora, String tema) {
        super(titulo, duracaoMinutos, anoLancamento, classificacaoEtaria, avaliacao);
        this.entidadePromotora = entidadePromotora;
        this.tema = tema;
    }

    @Override
    public void reproduzir() {
        System.out.println("A reproduzir documentário: " + this.titulo);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(this.entidadePromotora + " | " + this.tema);
    }
}
