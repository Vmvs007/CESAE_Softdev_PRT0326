package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiroOriginal = new File("Ficheiros/exercicio_03_Alternativa01.txt");
        File ficheiroCopia = new File("Ficheiros/exercicio_03_copia.txt");

        Scanner scannerFicheiroOriginal = new Scanner(ficheiroOriginal);
        PrintWriter maquinaEscrever = new PrintWriter(ficheiroCopia);

        while (scannerFicheiroOriginal.hasNextLine()){
            String linha = scannerFicheiroOriginal.nextLine();

            maquinaEscrever.println(linha);
        }

        scannerFicheiroOriginal.close();
        maquinaEscrever.close();
    }
}
