package Simulacao;

import SeresVivos.Inseto;
import SeresVivos.Planta;
import SeresVivos.SerVivo;

import java.util.ArrayList;
import java.util.Random;

public class MeioAmbiente {

    private String nome;
    private double agua;
    private ArrayList<SerVivo> seresVivos;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seresVivos = new ArrayList<SerVivo>();
    }

    public String getNome() {
        return nome;
    }

    public double getAgua() {
        return agua;
    }

    public void adicionarSerVivo(SerVivo serVivoNovo) {
        this.seresVivos.add(serVivoNovo);
    }

    public boolean plantaBebe(int indexPlanta) {

        Planta plantaSelecionada = (Planta) this.seresVivos.get(indexPlanta);

        double aguaNecessaria = 0;

        switch (plantaSelecionada.getFamilia()) {
            case ARVORE:
                aguaNecessaria = 1;
                break;

            case ERVA:
                aguaNecessaria = 0.25;
                break;

            case FLOR:
                aguaNecessaria = 0.1;
                break;
        }

        if (this.agua >= aguaNecessaria) {
            this.agua -= aguaNecessaria;
            return true;
        } else {
            // Planta secou e morreu
            this.seresVivos.remove(indexPlanta);
            return false;
        }

    }

    public int obterInsetoAleatorio() {
        ArrayList<Integer> listaIndexesInsetos = new ArrayList<Integer>();

        for (int i = 0; i < this.seresVivos.size(); i++) {

            if (this.seresVivos.get(i) instanceof Inseto) {
                listaIndexesInsetos.add(i);
            }
        }

        if(listaIndexesInsetos.isEmpty()){
            return -1;
        }else{
            Random rd = new Random();
            int insetoSorteado = rd.nextInt(listaIndexesInsetos.size());

            return listaIndexesInsetos.get(insetoSorteado);
        }

    }

    public boolean plantaComeInseto(int indexPlanta) {

        Planta plantaSelecionada = (Planta) this.seresVivos.get(indexPlanta);

        // Escolher um inseto aleatorio
        int indexInsetoAzarado = obterInsetoAleatorio();

        if (indexInsetoAzarado == -1) { // não há insetos
            this.seresVivos.remove(indexPlanta);
            return false;
        } else {
            this.seresVivos.remove(indexInsetoAzarado);
            return true;
        }
    }
}
