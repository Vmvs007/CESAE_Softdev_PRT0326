package Ex07;

public class Main {
    public static void main(String[] args) {
        Aluno quim = new Aluno("Joaquim", 30, "quim@mail.pt", "Software Developer", 12.5);
        quim.exibirDetalhes();
//
//        quim.felizAniversario();
//
//        System.out.println("_____________________________");
//
//        quim.exibirDetalhes();

        if (quim.situacaoAprovacao()) {
            System.out.println(quim.getNome() + " está aprovado");
        } else {
            System.out.println(quim.getNome() + " não está aprovado");
        }

    }
}
