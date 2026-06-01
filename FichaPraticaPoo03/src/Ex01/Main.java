package Ex01;

public class Main {
    public static void main(String[] args) {

        Musica mA = new Musica("The Scientist","Rock Alternativa","Coldplay",260);
        Musica mB = new Musica("Bohemian Rapsody","Rock","Queen",359);
        Musica mC = new Musica("Mestre da Culinária","Heavy Metal","Quim Barreiros",233);
        Musica mD = new Musica("Borderline","Indie Pop","Tame Impala",350);
        Musica mE = new Musica("Cajuina","MPB","Caetano Veloso",150);

        MusicPlayer mp = new MusicPlayer("Software Developer Class");
        mp.adicionarMusica(mA);
        mp.adicionarMusica(mB);
        mp.adicionarMusica(mC);
        mp.adicionarMusica(mD);
        mp.adicionarMusica(mE);

        mp.imprimirRelatorio();
    }
}
