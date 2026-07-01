package controllers;

import models.Venda;
import repositories.VendaRepository;

import java.io.FileNotFoundException;

public class AdminController {

    private VendaRepository vendaRepository;

    public AdminController() throws FileNotFoundException {
        this.vendaRepository = new VendaRepository();
    }

    public Venda melhorVendaQuantidade() {

        Venda melhorVenda = new Venda("", "", 0, 0);

        for (Venda vendaAtual : this.vendaRepository.getListaVendas()) {

            if (vendaAtual.getQuantidadeVendida() > melhorVenda.getQuantidadeVendida()) {
                melhorVenda = vendaAtual;
            }

        }

        return melhorVenda;

    }

    public double valorTotalVendas() {

        double total = 0;

        for (Venda vendaAtual : this.vendaRepository.getListaVendas()) {

            total += vendaAtual.getPrecoUnitario() * vendaAtual.getQuantidadeVendida();
        }

        return total;

    }

    public double mediaVendas() {

        return valorTotalVendas() / this.vendaRepository.getListaVendas().size();
    }
}
