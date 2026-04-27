package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.imprimirFicheiroNaConsola;

public class Ex01 {
    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheiroNaConsola("Ficheiros/exercicio_01.txt");

        imprimirFicheiroNaConsola("Ficheiros/exercicio_01_Alternativa01.txt");

        imprimirFicheiroNaConsola("Ficheiros/exercicio_01_Alternativa02.txt");

    }
}
