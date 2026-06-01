package Ex06;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] participantes;

    public Competicao(String nome, String pais, int maxInscritos) {
        this.nome = nome;
        this.pais = pais;
        this.participantes = new Atleta[maxInscritos];
    }

    public void inscreverAtletas(Atleta atletaNovo) {

        for (int i = 0; i < this.participantes.length; i++) {
            if (this.participantes[i] == null) {
                this.participantes[i] = atletaNovo;
                return;
            }
        }

    }

    public void listarParticipantes() {
        System.out.println("-+-+-+-+-+-+- PARTICIPANTES DA " + this.nome + " -+-+-+-+-+-+-");
        for (int i = 0; i < this.participantes.length; i++) {
            if (this.participantes[i] != null) {
                this.participantes[i].exibirDetalhes();
            }
        }
    }

    public void listarAtletasCasa() {
        System.out.println("-+-+-+-+-+-+- PARTICIPANTES DA CASA:" + this.pais + "-+-+-+-+-+-+-");
        for (int i = 0; i < this.participantes.length; i++) {
            if (this.participantes[i] != null && this.participantes[i].getPaisOrigem().equalsIgnoreCase(this.pais)) {
                this.participantes[i].exibirDetalhes();
            }
        }
    }
}
