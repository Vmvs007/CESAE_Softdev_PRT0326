package Ex04;

public class Main {
    public static void main(String[] args) {

        Circulo anel = new Circulo("Dourado", 7);
        Circulo donut = new Circulo("Amarelo", 6.5);

        if (anel.getRaio() > donut.getRaio()) {
            // Anel é maior
            System.out.println("Área: " + anel.calcularArea());
            System.out.println("Perímetro: " + anel.calcularPerimetro());
        } else {
            // Donut é maior
            System.out.println("Perímetro: " + donut.calcularArea());
            System.out.println("Perímetro: " + donut.calcularPerimetro());
        }
    }
}
