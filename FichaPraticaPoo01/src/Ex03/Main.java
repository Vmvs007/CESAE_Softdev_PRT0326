package Ex03;

public class Main {
    public static void main(String[] args) {

        Retangulo terreno = new Retangulo("Castanho", 15, 30);

        System.out.println("Área: " + terreno.calcularArea());
        System.out.println("Perímetro: " + terreno.calcularPerimetro());

    }
}
