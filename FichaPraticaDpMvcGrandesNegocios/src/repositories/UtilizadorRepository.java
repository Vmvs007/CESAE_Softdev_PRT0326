package repositories;

import models.Utilizador;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UtilizadorRepository {

    private ArrayList<Utilizador> listaUtilizadores;

    public UtilizadorRepository() throws FileNotFoundException {
        this.listaUtilizadores = CsvReader.lerFicheiroCsvUtilizadores("resources/login_grandesNegocios.csv");
    }

    public ArrayList<Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }
}
