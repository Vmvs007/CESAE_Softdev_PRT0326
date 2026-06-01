package Ex06;

public class Main {
    public static void main(String[] args) {

        Atleta atlA = new Atleta("Joaquim", "Setas no Café", 1.75, 90, "Portugal", 1);
        Atleta atlB = new Atleta("Cristiano Ronaldo", "Futebol", 1.88, 75, "Portugal", 1);
        Atleta atlC = new Atleta("Joana", "Atletismo", 1.6, 55, "Espanha", 3);
        Atleta atlD = new Atleta("Jorge", "Futebol", 1.7, 65, "Espanha", 55);
        Atleta atlE = new Atleta("José", "Futebol", 1.72, 68, "Portugal", 90);

        Competicao corridaCESAE = new Competicao("1º Corrida à Volta do CESAE","Portugal",20);
        corridaCESAE.inscreverAtletas(atlA);
        corridaCESAE.inscreverAtletas(atlB);
        corridaCESAE.inscreverAtletas(atlC);
        corridaCESAE.inscreverAtletas(atlD);
        corridaCESAE.inscreverAtletas(atlE);

        corridaCESAE.listarParticipantes();

        System.out.println("\n");

        corridaCESAE.listarAtletasCasa();



    }
}
