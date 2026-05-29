package Ex05;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoaA = new Pessoa("Joaquim", 30, "Porto", "quim@mail.pt", 911222333);
        Pessoa pessoaB = new Pessoa("José", 29, "Lisboa", "ze@mail.pt", 911222444);
        Pessoa pessoaC = new Pessoa("Joana", 31, "Porto", "joana@mail.pt", 911222555);
        Pessoa pessoaD = new Pessoa("Jorge", 15, "Braga", "jojo@mail.pt", 911222999);
        Pessoa pessoaE = new Pessoa("Josefina", 40, "Lisboa", "zefina@mail.pt", 911222000);

        Agenda aMinhaAgenda = new Agenda(15);
        aMinhaAgenda.adicionarContacto(pessoaA);
        aMinhaAgenda.adicionarContacto(pessoaB);
        aMinhaAgenda.adicionarContacto(pessoaC);
        aMinhaAgenda.adicionarContacto(pessoaD);
        aMinhaAgenda.adicionarContacto(pessoaE);

        aMinhaAgenda.listarContactosCidade("Porto");
    }
}
