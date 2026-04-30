package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("Ficheiros/exercicio_06.txt");
        Scanner sc = new Scanner(ficheiro);

        int maiorIdade = 0;
        String nomeMaisVelha = "";

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] itensLinha = linha.split(",");

            if (Integer.parseInt(itensLinha[1]) > maiorIdade) {
                maiorIdade = Integer.parseInt(itensLinha[1]);
                nomeMaisVelha = itensLinha[0];
            }
        }

        System.out.println("----- Pessoa Mais Velha -----");
        System.out.println(nomeMaisVelha + " com " + maiorIdade + " anos.");
    }
}
