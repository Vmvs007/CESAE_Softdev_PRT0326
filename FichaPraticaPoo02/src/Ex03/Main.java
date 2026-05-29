package Ex03;

public class Main {
    public static void main(String[] args) {

        String[] dietaDumbo = {"Erva","Palha","Fruta"};
        Animal dumbo = new Animal("Dumbo", "Elefante", "África do Sul", 950, dietaDumbo, ReinoAnimal.MAMIFERO);

        String[] dietaSimba = {"Carne"};
        Animal simba = new Animal("Simba", "Leão", "Quénia", 300, dietaSimba, ReinoAnimal.MAMIFERO);

        dumbo.exibirDetalhes();
        System.out.println("____________________________________________________________________");
        simba.exibirDetalhes();

        System.out.println("\n____________________________________________________________________");
        dumbo.comer("Sardinha",200);
        dumbo.exibirDetalhes();

        System.out.println("\n____________________________________________________________________");
        dumbo.comer("Palha",1500);
        dumbo.exibirDetalhes();

    }
}
