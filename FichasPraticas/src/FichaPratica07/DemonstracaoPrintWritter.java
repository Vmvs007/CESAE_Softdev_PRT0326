package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemonstracaoPrintWritter {
    public static void main(String[] args) throws FileNotFoundException {

        // Scanner teclado (input)
        Scanner input = new Scanner(System.in);

        // Criar ou abrir o ficheiro
        File ficheiroNovo = new File("Ficheiros/exercicio_02.txt");

        // Propósito: ler (Scanner) ou escrever (PrintWritter)
        PrintWriter maquinaEscrever = new PrintWriter(ficheiroNovo);

        // Ler mensagem a escrever
        System.out.print("Insira uma mensagem para colocar no ficheiro: ");
        String conteudoUtilizador = input.nextLine();

        maquinaEscrever.println(conteudoUtilizador);

        maquinaEscrever.close();

    }
}
