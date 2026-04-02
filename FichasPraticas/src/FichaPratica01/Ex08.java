package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int segundosTotaisAlbum = 0, minutosLidos, segundosLidos;

        // Leitura da duração das músicas
        System.out.print("Insira os minutos da música 1: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 1: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;


        System.out.print("\nInsira os minutos da música 2: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 2: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;


        System.out.print("\nInsira os minutos da música 3: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 3: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("\nInsira os minutos da música 4: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 4: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("\nInsira os minutos da música 5: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 5: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;

        // System.out.println("Segundos Totais do Album: "+segundosTotaisAlbum);

        int hh, mm, ss;

        // Calcular hh:mm:ss
        hh = segundosTotaisAlbum / 3600;

        segundosTotaisAlbum = segundosTotaisAlbum % 3600;

        mm = segundosTotaisAlbum / 60;

        ss = segundosTotaisAlbum % 60;


        // 1:41:40
        // Apresentar
        System.out.println("\nDuração Total: " + hh + "h " + mm + "m " + ss + "s");

    }
}
