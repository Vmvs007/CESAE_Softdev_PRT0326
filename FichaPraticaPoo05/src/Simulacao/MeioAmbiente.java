package Simulacao;

import Enums.FamiliaPlanta;
import SeresVivos.Animal;
import SeresVivos.Inseto;
import SeresVivos.Planta;
import SeresVivos.SerVivo;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Thread.sleep;

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
            System.out.println(plantaSelecionada.getNome() + " bebeu uma águinha");
            return true;
        } else {
            // Planta secou e morreu
            this.seresVivos.remove(indexPlanta);
            System.out.println(plantaSelecionada.getNome() + " secou por falta de água.");
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

    public int obterPlantaAleatoria() {
        ArrayList<Integer> listaIndexesPlantas = new ArrayList<Integer>();

        for (int i = 0; i < this.seresVivos.size(); i++) {

            if (this.seresVivos.get(i) instanceof Planta) {
                listaIndexesPlantas.add(i);
            }
        }

        if (listaIndexesPlantas.isEmpty()) {
            return -1;
        } else {
            Random rd = new Random();
            int insetoSorteado = rd.nextInt(listaIndexesPlantas.size());

            return listaIndexesPlantas.get(insetoSorteado);
        }

    }

    public int obterAnimalAleatorio() {
        ArrayList<Integer> listaIndexesAnimais = new ArrayList<Integer>();

        for (int i = 0; i < this.seresVivos.size(); i++) {

            if (this.seresVivos.get(i) instanceof Animal) {
                listaIndexesAnimais.add(i);
            }
        }

        if (listaIndexesAnimais.isEmpty()) {
            return -1;
        } else {
            Random rd = new Random();
            int insetoSorteado = rd.nextInt(listaIndexesAnimais.size());

            return listaIndexesAnimais.get(insetoSorteado);
        }

    }

    public int obterAnimalOuInsetoAleatorio() {
        ArrayList<Integer> listaIndexesAnimaisInsetos = new ArrayList<Integer>();

        for (int i = 0; i < this.seresVivos.size(); i++) {

            if (this.seresVivos.get(i) instanceof Animal || this.seresVivos.get(i) instanceof Inseto) {
                listaIndexesAnimaisInsetos.add(i);
            }
        }

        if (listaIndexesAnimaisInsetos.isEmpty()) {
            return -1;
        } else {
            Random rd = new Random();
            int insetoSorteado = rd.nextInt(listaIndexesAnimaisInsetos.size());

            return listaIndexesAnimaisInsetos.get(insetoSorteado);
        }

    }

    public int obterSerVivoAleatorio() {

        Random rd = new Random();
        int serVivoSorteado = rd.nextInt(this.seresVivos.size());

        return serVivoSorteado;


    }

    public boolean plantaComeInseto(int indexPlanta) {

        Planta plantaSelecionada = (Planta) this.seresVivos.get(indexPlanta);

        // Escolher um inseto aleatorio
        int indexInsetoAzarado = obterInsetoAleatorio();

        if (indexInsetoAzarado == -1) { // não há insetos
            this.seresVivos.remove(indexPlanta);
            System.out.println(plantaSelecionada.getNome() + " secou por falta de alimento.");
            return false;
        } else {
            Inseto insetoAzarado = (Inseto) this.seresVivos.get(indexInsetoAzarado);
            this.seresVivos.remove(indexInsetoAzarado);
            System.out.println(plantaSelecionada.getNome() + " comeu " + insetoAzarado + getNome());
            return true;
        }
    }

    public void exibirSeresVivos() {
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+- Seres Vivos que ainda estão no/a " + this.nome + " -+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("Contagem: " + this.seresVivos.size());
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
        Planta plantaSelecionada = (Planta) this.seresVivos.get(indexPlanta);
        System.out.println(plantaSelecionada.getNome() + " abanou com o vento.");
    }

    /**
     * Comportamento quando um animal faz o seu barulho característico
     *
     * @param indexAnimal Index do animal que vai fazer o barulho
     */
    public void animalFazBarulho(int indexAnimal) {
        Animal animalSelecionado = (Animal) this.seresVivos.get(indexAnimal);
        System.out.println(animalSelecionado.getBarulho());
    }

    public void animalMovimenta(int indexAnimal) {
        Animal animalSelecionado = (Animal) this.seresVivos.get(indexAnimal);
        System.out.println(animalSelecionado.getEspecie() + " " + animalSelecionado.getNome() + " movimentou-se");
    }

    /**
     * Comportamento para um animal beber água do meio ambiente
     *
     * @param indexAnimal Index do animal que vai beber
     * @return true - se o animal bebeu (e continua vivo) | false - se não bebeu e aí morre de sede (é removido do array de Seres Vivos)
     */
    public boolean animalBebe(int indexAnimal) {
        Animal animalSelecionado = (Animal) this.seresVivos.get(indexAnimal);

        double aguaNecessaria = 0.025 * animalSelecionado.getPeso();

        if (this.agua >= aguaNecessaria) {
            System.out.println(animalSelecionado.getNome() + " bebeu uma águinha.");
            this.agua -= aguaNecessaria;
            return true;
        } else {
            System.out.println(animalSelecionado.getNome() + " morreu à sede 💔");
            this.seresVivos.remove(indexAnimal);
            return false;
        }

    }

    public boolean animalCome(int indexAnimal) {
        Animal predador = (Animal) this.seresVivos.get(indexAnimal);

        switch (predador.getDieta()) {
            case HERBIVORO:

                int indexPlantaPresa = this.obterPlantaAleatoria();

                if (indexPlantaPresa == -1) {
                    System.out.println(predador.getEspecie() + " " + predador.getNome() + " não comeu porque não há plantas");
                    return false;
                } else {
                    Planta presa = (Planta) this.seresVivos.get(indexPlantaPresa);

                    int grauDefesaPresa = presa.getGrauDefesa();

                    if (grauDefesaPresa == 0) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + presa.getNome());
                        this.seresVivos.remove(indexPlantaPresa);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 1 && predador.getInteligencia() >= 20) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + presa.getNome());
                        this.seresVivos.remove(indexPlantaPresa);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 2 && predador.getInteligencia() >= 40) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + presa.getNome());
                        this.seresVivos.remove(indexPlantaPresa);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 3 && predador.getInteligencia() >= 60) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + presa.getNome());
                        this.seresVivos.remove(indexPlantaPresa);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 4 && predador.getInteligencia() >= 80) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + presa.getNome());
                        this.seresVivos.remove(indexPlantaPresa);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 5 && predador.getInteligencia() >= 95) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + presa.getNome());
                        this.seresVivos.remove(indexPlantaPresa);
                        predador.setDiasComFome(0);
                        return true;
                    } else {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " não comeu " + presa.getNome() + " porque é nabo");
                        return false;
                    }
                }


            case CARNIVORO:

                int contadorAnimais = 0;
                int contadorInsetos = 0;

                for (SerVivo serVivoAtual : this.seresVivos) {
                    if (serVivoAtual instanceof Animal) {
                        contadorAnimais++;
                    }
                    if (serVivoAtual instanceof Inseto) {
                        contadorInsetos++;
                    }
                }

                if (contadorAnimais == 1 && contadorInsetos == 0) {
                    System.out.println(predador.getEspecie() + " " + predador.getNome() + " não tem comida...");
                    return false;
                }

                int indexPresa = obterAnimalOuInsetoAleatorio();

                while (indexPresa == indexAnimal) {
                    indexPresa = obterAnimalOuInsetoAleatorio();
                }

                SerVivo presa = this.seresVivos.get(indexPresa);

                if (presa instanceof Animal) {
                    Animal animalPresa = (Animal) presa;

                    double capacidadePredador = (1 * predador.getPeso()) + (2.5 * predador.getInteligencia());
                    double capacidadePresa = (1 * animalPresa.getPeso()) + (2.5 * animalPresa.getInteligencia());

                    if (capacidadePredador >= capacidadePresa) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + animalPresa.getEspecie() + " " + animalPresa.getNome());
                        this.seresVivos.remove(indexPresa);
                        predador.setDiasComFome(0);
                        return true;
                    } else {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " não conseguiu comer " + animalPresa.getEspecie() + " " + animalPresa.getNome());
                        return false;
                    }

                }

                if (presa instanceof Inseto) {
                    Inseto insetoPresa = (Inseto) presa;

                    if (insetoPresa.isVenenoso()) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " foi envenenado por " + insetoPresa.getEspecie() + " " + insetoPresa.getNome());
                        this.seresVivos.remove(indexAnimal);
                        return false;
                    } else {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + insetoPresa.getEspecie() + " " + insetoPresa.getNome());
                        this.seresVivos.remove(indexPresa);
                        return true;
                    }
                }

                break;

            case OMNIVORO:

                if (this.seresVivos.size() == 1) {
                    System.out.println(predador.getEspecie() + " " + predador.getNome() + " não conseguiu comer porque está sozinho 😔");
                    return false;
                }

                int indexPresaAleatoria = obterSerVivoAleatorio();

                while (indexPresaAleatoria == indexAnimal) {
                    indexPresaAleatoria = obterSerVivoAleatorio();
                }

                if (this.seresVivos.get(indexPresaAleatoria) instanceof Planta) {
                    Planta plantaPresa = (Planta) this.seresVivos.get(indexPresaAleatoria);

                    int grauDefesaPresa = plantaPresa.getGrauDefesa();

                    if (grauDefesaPresa == 0) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + plantaPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 1 && predador.getInteligencia() >= 20) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + plantaPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 2 && predador.getInteligencia() >= 40) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + plantaPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 3 && predador.getInteligencia() >= 60) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + plantaPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 4 && predador.getInteligencia() >= 80) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + plantaPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        predador.setDiasComFome(0);
                        return true;
                    } else if (grauDefesaPresa == 5 && predador.getInteligencia() >= 95) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + plantaPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        predador.setDiasComFome(0);
                        return true;
                    } else {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " não comeu " + plantaPresa.getNome() + " porque é nabo");
                        return false;
                    }
                }

                if (this.seresVivos.get(indexPresaAleatoria) instanceof Animal) {
                    Animal animalPresa = (Animal) this.seresVivos.get(indexPresaAleatoria);

                    double capacidadePredador = (1 * predador.getPeso()) + (2.5 * predador.getInteligencia());
                    double capacidadePresa = (1 * animalPresa.getPeso()) + (2.5 * animalPresa.getInteligencia());

                    if (capacidadePredador >= capacidadePresa) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + animalPresa.getEspecie() + " " + animalPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        predador.setDiasComFome(0);
                        return true;
                    } else {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " não conseguiu comer " + animalPresa.getEspecie() + " " + animalPresa.getNome());
                        return false;
                    }
                }


                if (this.seresVivos.get(indexPresaAleatoria) instanceof Inseto) {
                    Inseto insetoPresa = (Inseto) this.seresVivos.get(indexPresaAleatoria);

                    if (insetoPresa.isVenenoso()) {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " foi envenenado por " + insetoPresa.getEspecie() + " " + insetoPresa.getNome());
                        this.seresVivos.remove(indexAnimal);
                        return false;
                    } else {
                        System.out.println(predador.getEspecie() + " " + predador.getNome() + " comeu " + insetoPresa.getEspecie() + " " + insetoPresa.getNome());
                        this.seresVivos.remove(indexPresaAleatoria);
                        return true;
                    }
                }
        }

        return false;
    }

    public void insetoChateia(int indexInseto) {
        Random rd = new Random();

        int escolha = rd.nextInt(4);

        switch (escolha) {
            case 0:
                System.out.println("Bzzzzz Bzzzzz");
                break;

            case 1:
                System.out.println("Tic Tic Tic Tic Tic");
                break;

            case 2:
                System.out.println("Psssssssssssssss");
                break;

            case 3:
                System.out.println("Poc Poc Poc");
                break;
        }

    }

    public void chuva() {
        this.agua += 5;
        System.out.println("Choveu no " + this.nome + " 🌧️");
    }

    public void chuvasTorrenciais() {
        double incrementoFixo = 25;
        double incrementoVariavel = this.agua * 2;

        if (incrementoFixo > incrementoVariavel) {
            this.agua += incrementoFixo;
        } else {
            this.agua += incrementoVariavel;
        }

        System.out.println("Choveu muito no " + this.nome + " ⛈️️");
    }

    public void trovoada() {

        int animalAzarado = obterAnimalAleatorio();

        if (animalAzarado != -1) {
            System.out.println("Cheirinho a churrasco ⚡");
            this.seresVivos.remove(animalAzarado);
        }
    }

    public void seca() {
        this.agua /= 2;
        // this.agua = this.agua / 2;
    }

    public void erupcaoVulcanica() {
        System.out.println("BOOOOOOOM \uD83C\uDF0B\uD83D\uDCA5");
    }

    public void tremorTerra() {
        System.out.println("Dale a tu cuerpo alegria, Macarena... Eh, Macarena (!ay!) 💃🕺");
    }

    public void incendio() {

        int plantaAzarada1 = obterPlantaAleatoria();

        if (plantaAzarada1 != -1) {
            this.seresVivos.remove(plantaAzarada1);
        }

        int plantaAzarada2 = obterPlantaAleatoria();

        if (plantaAzarada2 != -1) {
            this.seresVivos.remove(plantaAzarada2);
        }

        for (int i = 0; i < this.seresVivos.size(); i++) {

            SerVivo serVivoAtual = this.seresVivos.get(i);

            if (serVivoAtual instanceof Animal) {
                Animal animalAtual = (Animal) serVivoAtual;

                if (animalAtual.getInteligencia() <= 5) {
                    this.seresVivos.remove(animalAtual);
                    i--;
                }
            }
        }

        System.out.println("🔥🔥🔥🔥🔥🚒...");

    }

    public void simulador(int dias) throws InterruptedException {

        Random rd = new Random();
        int acaoAleatoria;

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+- SIMULAÇÃO PRESTES A COMEÇAR -+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-\n");

        for (int diaAtual = 1; diaAtual <= dias; diaAtual++) {
            sleep(3000);

            System.out.println("\n\nUm novo dia começou no " + this.nome + ". Temos " + this.agua + " L de água disponível.\n");
            this.exibirSeresVivos();

            for (int momentoDia = 1; momentoDia <= 3; momentoDia++) {

                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+- MOMENTO: " + momentoDia + " -+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-\n");
                sleep(2000);

                acaoAleatoria = rd.nextInt(10);

                if (acaoAleatoria == 0) { // DESASTRE

                    int desastreAleatorio = rd.nextInt(7);

                    switch (desastreAleatorio) {
                        case 0:
                            this.chuva();
                            break;

                        case 1:
                            this.chuvasTorrenciais();
                            break;

                        case 2:
                            this.trovoada();
                            break;

                        case 3:
                            this.seca();
                            break;

                        case 4:
                            this.erupcaoVulcanica();
                            break;

                        case 5:
                            this.tremorTerra();
                            break;

                        case 6:
                            this.incendio();
                            break;
                    }

                } else if (acaoAleatoria <= 3) { // PLANTA

                    int plantaAleatoria = obterPlantaAleatoria();

                    if (plantaAleatoria == -1) {
                        System.out.println("Não temos plantas vivas...");
                    } else {

                        Planta plantaSelecionada = (Planta) this.seresVivos.get(plantaAleatoria);

                        int acaoPlanta = rd.nextInt(2);

                        switch (acaoPlanta) {
                            case 0:
                                this.plantaAbanaComVento(plantaAleatoria);
                                break;

                            case 1:

                                if (plantaSelecionada.getFamilia() == FamiliaPlanta.COME_INSETOS) {
                                    this.plantaComeInseto(plantaAleatoria);
                                } else {
                                    this.plantaBebe(plantaAleatoria);
                                }
                                break;
                        }

                    }

                } else if (acaoAleatoria <= 6) { // ANIMAL

                    int animalAleatorio = obterAnimalAleatorio();

                    if (animalAleatorio == -1) {
                        System.out.println("Não temos animais vivos...");
                    } else {

                        int acaoAnimal = rd.nextInt(4);

                        switch (acaoAnimal) {
                            case 0:
                                this.animalMovimenta(animalAleatorio);
                                break;

                            case 1:
                                this.animalFazBarulho(animalAleatorio);
                                break;

                            case 2:
                                this.animalBebe(animalAleatorio);
                                break;

                            case 3:
                                this.animalCome(animalAleatorio);
                                break;
                        }

                    }

                } else { // INSETO

                    int insetoAleatorio = obterInsetoAleatorio();

                    if (insetoAleatorio == -1) {
                        System.out.println("Não temos insetos vivos...");
                    } else {
                        this.insetoChateia(insetoAleatorio);
                    }
                }
            }


        }

        if (this.seresVivos.isEmpty()) {
            System.out.println("\nMORRERAM TODOS!!!");
        } else {
            System.out.println("\nResistentes");
            this.exibirSeresVivos();
        }

    }
}
