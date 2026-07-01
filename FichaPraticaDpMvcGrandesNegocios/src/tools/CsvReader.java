package tools;

import models.Utilizador;
import models.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReader {

    public static ArrayList<Utilizador> lerFicheiroCsvUtilizadores(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Utilizador> listaUtilizadores = new ArrayList<Utilizador>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(";");

            String tipoContaAtual = linhaSeparada[0];
            String usernameAtual = linhaSeparada[1];
            String passwordAtual = linhaSeparada[2];

            Utilizador utilizadorAtual = new Utilizador(tipoContaAtual, usernameAtual, passwordAtual);
            listaUtilizadores.add(utilizadorAtual);

        }

        return listaUtilizadores;

    }

    public static ArrayList<Venda> lerFicheiroCsvVendas(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Venda> listaVendas = new ArrayList<Venda>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String tipoProdutoAtual = linhaSeparada[0];
            String produtoAtual = linhaSeparada[1];
            double quantidadeVendidaAtual = Double.parseDouble(linhaSeparada[2]);
            double precoUnitarioAtual = Double.parseDouble(linhaSeparada[3]);

            Venda vendaAtual = new Venda(tipoProdutoAtual, produtoAtual, quantidadeVendidaAtual, precoUnitarioAtual);
            listaVendas.add(vendaAtual);

        }

        return listaVendas;

    }
}


