public class Sapo implements Terrestre, Aquatico{

    private String nome;
    private double peso;

    public Sapo(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public void nadar() {
        System.out.println("Sapo a nadar");
    }

    @Override
    public void mergulhar() {
        System.out.println("Sapo a mergulhar");
    }

    @Override
    public void andar() {
        System.out.println("Sapo a andar");
    }

    @Override
    public void correr() {
        System.out.println("Sapo a correr");
    }

    @Override
    public void saltar() {
        System.out.println("Sapo a saltar");
    }
}
