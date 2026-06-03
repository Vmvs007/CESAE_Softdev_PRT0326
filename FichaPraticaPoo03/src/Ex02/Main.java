package Ex02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoaA = new Pessoa("Joaquim", 30, 911222333, "quim@mail.pt");
        Pessoa pessoaB = new Pessoa("Jorge", 18, 911333111, "jorge@mail.pt");
        Pessoa pessoaC = new Pessoa("Joana", 12, 911222222, "joana@mail.pt");
        Pessoa pessoaD = new Pessoa("José", 40, 911222999, "ze@mail.pt");
        Pessoa pessoaE = new Pessoa("Jéssica", 33, 911222444, "jessica@mail.pt");

        Sorteio rifasAldeia = new Sorteio("Rifas de Arouca", 200000);

        rifasAldeia.inscreverPessoa(pessoaA);
        rifasAldeia.inscreverPessoa(pessoaB);
        rifasAldeia.inscreverPessoa(pessoaC);
        rifasAldeia.inscreverPessoa(pessoaD);
        rifasAldeia.inscreverPessoa(pessoaE);

        Pessoa vencedorSorteio = rifasAldeia.sortear();

        System.out.println("\n-+-+-+-+-+-+-+-+- VENCEDOR -+-+-+-+-+-+-+-+-");
        System.out.println(rifasAldeia.getNome() + " | " + rifasAldeia.getPremio() + " €");
        vencedorSorteio.exibirDetalhes();

    }
}
