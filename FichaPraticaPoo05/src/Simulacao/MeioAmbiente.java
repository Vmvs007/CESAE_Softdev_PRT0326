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

    public void removerSerVivo(SerVivo serVivoRemover) {
        this.seresVivos.remove(serVivoRemover);
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

        if (listaIndexesInsetos.isEmpty()) {
            return -1;
        } else {
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

    public void exibirSeresVivos() {
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+- Seres Vivos que ainda estão no/a " + this.nome + " -+-+-+-+-+-+-+-+-+-+-+-");
        for (SerVivo serVivoAtual : this.seresVivos) {
            serVivoAtual.exibirDetalhes();
        }
    }

    /**
     * Comportamento quando uma planta abana com o vento
     *
     * @param indexPlanta Index da planta que vai abanar
     */
    public void plantaAbanaComVento(int indexPlanta) {
        // TODO: Método não desenvolvido
    }

    /**
     * Comportamento quando um animal faz o seu barulho característico
     *
     * @param indexAnimal Index do animal que vai fazer o barulho
     */
    public void animalFazBarulho(int indexAnimal) {
        // TODO: Método não desenvolvido
    }

    /**
     * Comportamento para um animal beber água do meio ambiente
     *
     * @param indexAnimal Index do animal que vai beber
     * @return true - se o animal bebeu (e continua vivo) | false - se não bebeu e aí morre de sede (é removido do array de Seres Vivos)
     */
    public boolean animalBebe(int indexAnimal) {
        // TODO: Método não desenvolvido
        return true;
    }

    public boolean animalCome(int indexAnimal) {
        // TODO: Método não desenvolvido
        return true;
    }

    public void insetoChateia(int indexInseto) {
        // TODO: Método não desenvolvido
    }

    public void chuva() {
        // TODO: Método não desenvolvido
    }

    public void chuvasTorrenciais() {
        // TODO: Método não desenvolvido
    }

    public void trovoada() {
        // TODO: Método não desenvolvido
    }

    public void seca() {
        // TODO: Método não desenvolvido
    }

    public void erupcaoVulcanica() {
        // TODO: Método não desenvolvido
    }

    public void tremorTerra() {
        // TODO: Método não desenvolvido
    }

    public void incendio() {
        // TODO: Método não desenvolvido
    }

    public void simulador() {
        // TODO: Método não desenvolvido
    }
}
