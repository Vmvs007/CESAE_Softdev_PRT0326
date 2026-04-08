package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int valor, numeroNotas;

        // Ler valor
        System.out.print("Valor: ");
        valor = input.nextInt();

        if(valor%5==0){

            // Notas de 200
            numeroNotas = valor / 200;
            System.out.println("Notas de 200€: " + numeroNotas);
            valor = valor % 200;

            // Notas de 100
            numeroNotas = valor / 100;
            System.out.println("Notas de 100€: " + numeroNotas);
            valor = valor % 100;

            // Notas de 200
            numeroNotas = valor / 50;
            System.out.println("Notas de  50€: " + numeroNotas);
            valor = valor % 50;

            // Notas de 20
            numeroNotas = valor / 20;
            System.out.println("Notas de  20€: " + numeroNotas);
            valor = valor % 20;

            // Notas de 10
            numeroNotas = valor / 10;
            System.out.println("Notas de  10€: " + numeroNotas);
            valor = valor % 10;

            // Notas de 5
            numeroNotas = valor / 5;
            System.out.println("Notas de   5€: " + numeroNotas);
        }else{
            System.out.println("Não damos trocos");
        }


    }
}
