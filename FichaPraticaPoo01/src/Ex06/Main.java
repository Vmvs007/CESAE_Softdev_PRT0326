package Ex06;

public class Main {
    public static void main(String[] args) {

        Livro cemAnosSolidao= new Livro("100 Anos de Solidão","Gabriel Garcia Marquez","Fantasia",750,"1234567891234");
        Livro livro1984= new Livro("1984","George Orwell","Distopico",290,"09876543214321");

        cemAnosSolidao.exibirDetalhes();

        System.out.println("_______________________________________");

        livro1984.exibirDetalhes();
    }
}
