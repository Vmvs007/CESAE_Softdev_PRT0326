public class Golfinho implements Aquatico{

    private String nome;
    private String cor;

    public Golfinho(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho a nadar");
    }

    @Override
    public void mergulhar() {
        System.out.println("Golfinho a mergulhar");
    }
}
