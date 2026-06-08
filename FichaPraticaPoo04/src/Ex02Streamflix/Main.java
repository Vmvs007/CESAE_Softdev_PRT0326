package Ex02Streamflix;

import Ex02Streamflix.Conteudos.Concerto;
import Ex02Streamflix.Conteudos.Documentario;
import Ex02Streamflix.Conteudos.Filme;
import Ex02Streamflix.Conteudos.Serie;
import Ex02Streamflix.Enums.EntidadePromotora;
import Ex02Streamflix.Enums.Genero;

public class Main {
    public static void main(String[] args) {

        Filme interstellar = new Filme("Interstellar", 170, 2014, 14, 10, Genero.FICCAO_CIENTIFICA, "Christopher Nolan", true);
        Filme matrix = new Filme("Matrix", 160, 1999, 16, 9, Genero.FICCAO_CIENTIFICA, "Wachowski", true);

        Serie got = new Serie("Game of Thrones", 0, 2011, 18, 8, Genero.FANTASIA, 8, 10, 55);
        Serie westworld = new Serie("Westworld", 0, 2013, 18, 8, Genero.FICCAO_CIENTIFICA, 4, 10, 60);

        Documentario vidaSelvagem = new Documentario("BBC: Vida Selvagem", 120, 2002, 12, 7, EntidadePromotora.BBC_EARTH, "Natureza");
        Documentario cosmos = new Documentario("Cosmos", 180, 2015, 8, 9, EntidadePromotora.NATIONAL_GEOGRAPHIC, "Universo");

        Concerto guns = new Concerto("Guns n Roses: PT", 150, 2025, 16, 8, "Portugal", "Estádio Coimbra", "Guns n Roses");

        PlataformaStreaming streamflix = new PlataformaStreaming("Streamflix", 1.9);
        streamflix.adicionarConteudo(interstellar);
        streamflix.adicionarConteudo(got);
        streamflix.adicionarConteudo(westworld);
        streamflix.adicionarConteudo(vidaSelvagem);
        streamflix.adicionarConteudo(matrix);
        streamflix.adicionarConteudo(cosmos);
        streamflix.adicionarConteudo(guns);

        streamflix.listarCatalogoOrganizado();
    }
}
