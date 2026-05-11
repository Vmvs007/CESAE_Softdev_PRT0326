package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {

    /**
     * Função que conta o número de linhas de um ficheiro
     *
     * @param caminhoFicheiro Caminho para o ficheiro
     * @return Número de linhas totais
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        int contagemLinhas = 0;

        // Enquanto o Scanner tiver uma linha para a frente
        while (sc.hasNextLine()) {
            // Avançamos a linha atual
            sc.nextLine();

            // Contamos +1
            contagemLinhas++;
        }

        return contagemLinhas;

    }

    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        String linha = sc.nextLine();
        String[] linhaSeparada = linha.split(delimitador);

        int contagemColunas = linhaSeparada.length;

        return linha.split(",").length;
    }

    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        int numeroLinhas = contarLinhasFicheiro(caminhoFicheiro) - 1;
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, delimitador);

        int linhaAtualMatriz = 0;

        String[][] matrizCompleta = new String[numeroLinhas][numeroColunas];

        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        // Avançar o cabeçalho
        sc.nextLine();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(delimitador);

//            matrizCompleta[linhaAtualMatriz][0] = linhaSeparada[0];
//            matrizCompleta[linhaAtualMatriz][1] = linhaSeparada[1];
//            matrizCompleta[linhaAtualMatriz][2] = linhaSeparada[2];
//            matrizCompleta[linhaAtualMatriz][3] = linhaSeparada[3];

            for (int i = 0; i < numeroColunas; i++) {
                matrizCompleta[linhaAtualMatriz][i] = linhaSeparada[i];
            }

            linhaAtualMatriz++;
        }

        return matrizCompleta;

    }

    public static void pesquisarMusicasPorGenero(String[][] matrizMusicas, String generoPesquisar) {

        for (int linha = 0; linha < matrizMusicas.length; linha++) {
            if (matrizMusicas[linha][2].equalsIgnoreCase(generoPesquisar)) {
                System.out.println(matrizMusicas[linha][0] + "||" + matrizMusicas[linha][1]);
            }
        }
    }

    public static void pesquisarMusicasPorArtista(String[][] matrizMusicas, String artistaPesquisar) {

        for (int linha = 0; linha < matrizMusicas.length; linha++) {
            if (matrizMusicas[linha][1].equalsIgnoreCase(artistaPesquisar)) {
                System.out.println(matrizMusicas[linha][0] + "||" + matrizMusicas[linha][1]);
            }
        }
    }

    public static void menuCliente(String[][] matrizMusicas){
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n\n------------------------------------------------");
            System.out.println("----- Menu de Análise de Playlists - Cliente -----");
            System.out.println("1. Pesquisar por músicas de um determinado género");
            System.out.println("2. Pesquisar músicas de um determinado artista");
            System.out.println("3. Pesquisar música com maior duração");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
            System.out.println("5. Número de músicas da playlist");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("1. Pesquisar por músicas de um determinado género");

                    System.out.print("Género a pesquisar: ");
                    input.nextLine(); // Limpar buffer
                    String generoPesquisar = input.nextLine();

                    pesquisarMusicasPorGenero(matrizMusicas,generoPesquisar);


                    break;

                case 2:
                    System.out.println("2. Pesquisar músicas de um determinado artista");


                    System.out.print("Artista a pesquisar: ");
                    input.nextLine(); // Limpar buffer
                    String artistaPesquisar = input.nextLine();

                    pesquisarMusicasPorArtista(matrizMusicas,artistaPesquisar);

                    break;

                case 3:
                    System.out.println("3. Pesquisar música com maior duração");
                    break;

                case 4:
                    System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
                    break;

                case 5:
                    System.out.println("5. Número de músicas da playlist");
                    System.out.println(matrizMusicas.length);
                    break;

                case 0:
                    System.out.println("0. Sair");
                    break;

                default:
                    System.out.println("Opção Inválida: " + opcao);
                    break;
            }

        } while (opcao != 0);

    }

    public static void menuAdmin(String[][] matrizMusicas){
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n\n------------------------------------------------");
            System.out.println("----- Menu de Análise de Playlists - Admin -----");
            System.out.println("1. Adicionar nova música");
            System.out.println("2. Remover música");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("1. Adicionar nova música");

                    break;

                case 2:
                    System.out.println("2. Remover música");

                    break;

                case 0:
                    System.out.println("0. Sair");
                    break;

                default:
                    System.out.println("Opção Inválida: " + opcao);
                    break;
            }

        } while (opcao != 0);
    }

    public static void menuLogin(String[][] matrizMusicas){
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n\n------------------------------------------------");
            System.out.println("----- Bem-vindo/a ao Programa de Análise de Playlists -----");
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("\n\n\n------------------------------------------------");

            switch (opcao) {
                case 1:
                    menuCliente(matrizMusicas);
                    break;

                case 2:
                    System.out.print("Username: ");
                    input.nextLine();
                    String usernameInput = input.nextLine();

                    System.out.print("Password: ");
                    String passwordInput = input.nextLine();

                    if(usernameInput.equalsIgnoreCase("it") && passwordInput.equalsIgnoreCase("12345")){
                        menuAdmin(matrizMusicas);
                    }else{
                        System.out.println("\nCredenciais Inválidas");
                    }

                    break;

                case 0:
                    System.out.println("0. Sair");
                    break;

                default:
                    System.out.println("Opção Inválida: " + opcao);
                    break;
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizMusicas = lerFicheiroParaMatriz("Ficheiros/exercicio_09.csv",",");

        menuLogin(matrizMusicas);


    }
}
