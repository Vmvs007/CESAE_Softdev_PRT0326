package Ex02Streamflix.Conteudos;

import Ex02Streamflix.Enums.Genero;

public class Entretenimento extends Conteudo{

    protected Genero genero;

    public Entretenimento(String titulo, int duracaoMinutos, int anoLancamento, int classificacaoEtaria, int avaliacao, Genero genero) {
        super(titulo, duracaoMinutos, anoLancamento, classificacaoEtaria, avaliacao);
        this.genero = genero;
    }
}
