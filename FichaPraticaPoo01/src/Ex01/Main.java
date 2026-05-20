package Ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa quim = new Pessoa("Joaquim",30,1.7);
        Pessoa joana = new Pessoa("Joana",35,1.65);

        System.out.println(quim.getNome());
        System.out.println(quim.getIdade());
        System.out.println(quim.getAltura());

        System.out.println("____________________________");

        System.out.println(joana.getNome());
        System.out.println(joana.getIdade());
        System.out.println(joana.getAltura());

    }
}
