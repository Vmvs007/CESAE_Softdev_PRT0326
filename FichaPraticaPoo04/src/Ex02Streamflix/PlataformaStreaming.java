package Ex02Streamflix;

import Ex02Streamflix.Conteudos.*;

import java.io.FileWriter;
import java.util.ArrayList;

public class PlataformaStreaming {
    private String nome;
    private double precoMes;
    private ArrayList<Conteudo> catalogo;

    public PlataformaStreaming(String nome, double precoMes) {
        this.nome = nome;
        this.precoMes = precoMes;
        this.catalogo = new ArrayList<Conteudo>();
    }

    public void adicionarConteudo(Conteudo conteudoNovo) {
        this.catalogo.add(conteudoNovo);
    }

    public void removerConteudo(Conteudo conteudoRemover) {
        this.catalogo.remove(conteudoRemover);
    }

    public void maratona() {
        System.out.println("-+-+-+-+-+-+-+-+-+-+- Maratona -+-+-+-+-+-+-+-+-+-+-");
        for (Conteudo conteudoAtual : this.catalogo) {
            System.out.println();
            conteudoAtual.reproduzir();
        }
    }

    public void listarCatalogo() {
        System.out.println("-+-+-+-+-+-+-+-+-+-+- Catálogo Completo: " + this.nome + "-+-+-+-+-+-+-+-+-+-+-");
        for (Conteudo conteudoAtual : this.catalogo) {
            System.out.println();
            conteudoAtual.exibirDetalhes();
        }
    }

    public void listarCatalogoOrganizado() {
        System.out.println("-+-+-+-+-+-+-+-+-+-+- Catálogo Organizado: " + this.nome + "-+-+-+-+-+-+-+-+-+-+-");

        System.out.println("\n-+-+-+-+-+-+-+-+-+-+- Filmes -+-+-+-+-+-+-+-+-+-+-");
        for (Conteudo conteudoAtual : this.catalogo) {

            if (conteudoAtual instanceof Filme) {
                System.out.println();
                conteudoAtual.exibirDetalhes();
            }

        }

        System.out.println("\n-+-+-+-+-+-+-+-+-+-+- Séries -+-+-+-+-+-+-+-+-+-+-");
        for (Conteudo conteudoAtual : this.catalogo) {

            if (conteudoAtual instanceof Serie) {
                System.out.println();
                conteudoAtual.exibirDetalhes();
            }

        }

        System.out.println("\n-+-+-+-+-+-+-+-+-+-+- Documentários -+-+-+-+-+-+-+-+-+-+-");
        for (Conteudo conteudoAtual : this.catalogo) {

            if (conteudoAtual instanceof Documentario) {
                System.out.println();
                conteudoAtual.exibirDetalhes();
            }

        }

        System.out.println("\n-+-+-+-+-+-+-+-+-+-+- Concertos -+-+-+-+-+-+-+-+-+-+-");
        for (Conteudo conteudoAtual : this.catalogo) {

            if (conteudoAtual instanceof Concerto) {
                System.out.println();
                conteudoAtual.exibirDetalhes();
            }

        }
    }


    public int calcularQuantidadeConteudos() {
        return this.catalogo.size();
    }


}
