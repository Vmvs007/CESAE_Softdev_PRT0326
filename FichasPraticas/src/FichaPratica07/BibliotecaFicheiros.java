package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFicheiros {

    public static void imprimirFicheiroNaConsola(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        while (fileScanner.hasNextLine()) {
            String linha = fileScanner.nextLine();
            System.out.println(linha);
        }

    }

}
