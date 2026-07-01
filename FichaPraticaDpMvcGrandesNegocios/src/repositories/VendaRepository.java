package repositories;

import models.Venda;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendaRepository {

    private ArrayList<Venda> listaVendas;

    public VendaRepository() throws FileNotFoundException {
        this.listaVendas = CsvReader.lerFicheiroCsvVendas("resources/minimercado.csv");
    }

    public ArrayList<Venda> getListaVendas() {
        return listaVendas;
    }
}
