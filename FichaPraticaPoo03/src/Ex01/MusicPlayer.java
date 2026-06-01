package Ex01;

import java.util.ArrayList;

public class MusicPlayer {
    private String criador;
    private ArrayList<Musica> programacaoMusical;

    public MusicPlayer(String criador) {
        this.criador = criador;
        this.programacaoMusical = new ArrayList<Musica>();
    }

    public void adicionarMusica(Musica musicaNova) {
        this.programacaoMusical.add(musicaNova);
    }

    public void removerMusica(Musica musicaRemover) {
        this.programacaoMusical.remove(musicaRemover);
    }

    public void limparProgramacao() {
        this.programacaoMusical.clear();
    }

    public void trocarMusicas(Musica m1, Musica m2) {
        int indexMusica1 = this.programacaoMusical.indexOf(m1);
        int indexMusica2 = this.programacaoMusical.indexOf(m2);

        this.programacaoMusical.set(indexMusica1, m2);
        this.programacaoMusical.set(indexMusica2, m1);
    }

    public void duracaoTotalAlbum() {
        int duracaoTotalSegundos = 0;

        for (Musica musicaAtual : this.programacaoMusical) {
            duracaoTotalSegundos += musicaAtual.getDuracaoSeg();
        }

        int hh, mm, ss;

        hh = duracaoTotalSegundos / 3600;
        mm = (duracaoTotalSegundos % 3600)/60;
        ss = duracaoTotalSegundos % 60;

        System.out.println(hh + ":" + mm + ":" + ss);
    }

    public void imprimirRelatorio() {
        System.out.println("-+-+-+-+-+-+- Playlista criada por: " + this.criador + " -+-+-+-+-+-+-");

        for (Musica musicaAtual : this.programacaoMusical) {
            musicaAtual.exibirDetalhes();
        }

        System.out.print("Duração Total: ");
        this.duracaoTotalAlbum();
    }
}
