package Ex03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double pesoKg;
    private String[] dieta;
    private ReinoAnimal reino;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] dieta, ReinoAnimal reino) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.dieta = dieta;
        this.reino = reino;
    }

    public void fazerBarulho() {
        switch (this.reino) {
            case MAMIFERO:
                System.out.println("Tinoninoni");
                break;

            case ANFIBIO:
                System.out.println("Brrrrrrrr");
                break;

            case AVE:
                System.out.println("Kwak Kwak");
                break;

            case PEIXE:
                System.out.println("Blub Blub Splash");
                break;

            case REPTIL:
                System.out.println("Pssssssssss");
                break;

        }
    }

    public void comer(String alimento, double pesoAlimentoG) {

        boolean animalGostaAlimento = false;

        for (int i = 0; i < this.dieta.length; i++) {
            if (this.dieta[i].equalsIgnoreCase(alimento)) {
                // Encontramos o alimento na dieta do Animal, ele gosta de comer isto
                animalGostaAlimento = true;
            }
        }

        if (animalGostaAlimento) {
            this.pesoKg += pesoAlimentoG / 1000;
            System.out.println("O " + this.especie + " " + this.nome + " comeu " + alimento);
            this.fazerBarulho();
        }else{
            System.out.println("O " + this.especie + " " + this.nome + " não comeu " + alimento);
        }
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.especie + " | " + this.reino + " | " + this.paisOrigem + " | " + this.pesoKg + " Kg.");
        System.out.print("Dieta: ");
        for (int i = 0; i < this.dieta.length; i++) {
            System.out.print(this.dieta[i] + " - ");
        }
        System.out.println();

    }
}
