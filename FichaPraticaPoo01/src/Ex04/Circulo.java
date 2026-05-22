package Ex04;

public class Circulo {
    private String cor;
    private double raio;

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double calcularArea() {
        return 3.14 * this.raio * this.raio;
    }

    public double calcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }
}
