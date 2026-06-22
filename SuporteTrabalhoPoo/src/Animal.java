import java.util.Scanner;

public class Animal {
    private String especie;
    private String nome;
    private int idade;
    private double peso;

    public Animal() {
        Scanner input = new Scanner(System.in);

        System.out.print("Espécie: ");
        this.especie = input.nextLine();

        System.out.print("Nome: ");
        this.nome = input.nextLine();

        System.out.print("Idade: ");
        this.idade = input.nextInt();

        System.out.print("Peso: ");
        this.peso = input.nextDouble();

        System.out.println(this.nome+" foi criado com sucesso!\n");
    }

    public Animal(String especie, String nome, int idade, double peso) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
}
