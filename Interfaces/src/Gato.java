public class Gato implements Terrestre{

    private String nome;
    private String raca;

    public Gato(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public void andar() {
        System.out.println("Gato a andar");
    }

    @Override
    public void correr() {
        System.out.println("Gato a correr");
    }

    @Override
    public void saltar() {
        System.out.println("Gato a saltar");
    }
}
