package Ex02;

public class Main {
    public static void main(String[] args) {

        Edificio edificio1 = new Edificio("Edificio do Sol", "Rua de Cima", "Porto", "Branca", 10, true);

        System.out.println(edificio1.getNome() + " | " + edificio1.getRua() + " | " + edificio1.getCidade());
        System.out.println(edificio1.getCorFachada() + " | Andares: " + edificio1.getNumeroAndares() + " | Tem garagem: " + edificio1.getTemGaragem());

        edificio1.setCorFachada("Azul");

        System.out.println("\n" + edificio1.getNome() + " | " + edificio1.getRua() + " | " + edificio1.getCidade());
        System.out.println(edificio1.getCorFachada() + " | Andares: " + edificio1.getNumeroAndares() + " | Tem garagem: " + edificio1.getTemGaragem());


    }
}
