package Ex03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marcaBarco;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marcaBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marcaBarco = marcaBarco;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public double cargaAtual() {
        double cargaTotal = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            cargaTotal += peixeAtual.getPesoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaTotal += mariscoAtual.getPesoKg();
        }

        return cargaTotal;
    }

    public void pescarPeixe(Peixe peixeNovo) {

        if (this.cargaAtual() + peixeNovo.getPesoKg() > this.capacidadeCarga) {
            System.out.println("Pesca sem sucesso: não temos capacidade de carga para " + peixeNovo.getPesoKg() + "Kg. de " + peixeNovo.getEspecie());
        } else {
            System.out.println("Pesca efetuada: " + peixeNovo.getPesoKg() + " de Kg. " + peixeNovo.getEspecie());
            this.peixesPescados.add(peixeNovo);
        }
    }

    public void pescarMarisco(Marisco mariscoNovo) {

        if (this.cargaAtual() + mariscoNovo.getPesoKg() > this.capacidadeCarga) {
            System.out.println("Pesca sem sucesso: não temos capacidade de carga para " + mariscoNovo.getPesoKg() + " Kg. de " + mariscoNovo.getEspecie());
        } else {
            System.out.println("Pesca efetuada: " + mariscoNovo.getPesoKg() + " Kg. de " + mariscoNovo.getEspecie());
            this.mariscoPescado.add(mariscoNovo);
        }
    }

    public void largarPeixe(Peixe peixeLargar) {
        this.peixesPescados.remove(peixeLargar);
        System.out.println("Largamos: " + peixeLargar.getEspecie());
    }

    public void largarMarisco(Marisco mariscoLargar) {
        this.mariscoPescado.remove(mariscoLargar);
        System.out.println("Largamos: " + mariscoLargar.getEspecie());
    }

    public double valorAtual() {
        double valorTotal = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            valorTotal += peixeAtual.getPesoKg() * peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            valorTotal += mariscoAtual.getPesoKg() * mariscoAtual.getPrecoKg();
        }

        return valorTotal;
    }

    public double salarioIndividualTripulacao() {

        return (this.valorAtual() * 0.6) / this.tripulacao;

    }

    public void exibirDetalhes() {
        System.out.println("-+-+-+-+-+-+-+-+-+- DETALHES BARCO DE PESCA -+-+-+-+-+-+-+-+-+-");
        System.out.println(this.nome + " | " + this.marcaBarco + " | " + this.cor + " | " + this.anoFabrico + " | Tripulação: " + this.tripulacao);
        System.out.print("Carga Atual: " + this.cargaAtual() + "/" + this.capacidadeCarga + " Kg. | ");
        System.out.println("Valor da Carga: " + this.valorAtual() + " €");
        System.out.println("Cada pessoa que está neste barco neste momento ganhou: "+this.salarioIndividualTripulacao()+" €");

        System.out.println("\n-+-+-+-+-+-+-+-+-+- PEIXE PESCADO -+-+-+-+-+-+-+-+-+-");

        for (Peixe peixeAtual : this.peixesPescados) {
            peixeAtual.exibirDetalhes();
        }

        System.out.println("\n-+-+-+-+-+-+-+-+-+- MARISCO PESCADO -+-+-+-+-+-+-+-+-+-");

        for (Marisco mariscoAtual : this.mariscoPescado) {
            mariscoAtual.exibirDetalhes();
        }
    }
}
