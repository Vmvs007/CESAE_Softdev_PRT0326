package Ex05;

public class Agenda {
    private int anoCriacao = 2026;
    private Pessoa[] contactos;

    Agenda(int tamanhoAgenda) {
        this.contactos = new Pessoa[tamanhoAgenda];
    }

    public void adicionarContacto(Pessoa pessoaNova) {

        for (int i = 0; i < this.contactos.length; i++) {

            if (this.contactos[i] == null) {
                this.contactos[i] = pessoaNova;
                return;
            }
        }
    }

    public void listarContactos() {
        System.out.println("-+-+-+-+-+-+-+-+- CONTACTOS -+-+-+-+-+-+-+-+-");
        for (int i = 0; i < this.contactos.length; i++) {
            if (this.contactos[i] != null) {
                this.contactos[i].exibirDetalhes();
            }
        }
    }

    public void listarContactosCidade(String cidadePesquisar) {
        System.out.println("-+-+-+-+-+-+-+-+- CONTACTOS EM " + cidadePesquisar + " -+-+-+-+-+-+-+-+-");
        for (int i = 0; i < this.contactos.length; i++) {
            if (this.contactos[i] != null) {

                if (this.contactos[i].getCidade().equalsIgnoreCase(cidadePesquisar)) {
                    this.contactos[i].exibirDetalhes();
                }
            }
        }
    }
}
