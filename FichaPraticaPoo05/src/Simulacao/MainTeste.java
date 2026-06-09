package Simulacao;

import Enums.DietaAnimal;
import Enums.FamiliaPlanta;
import SeresVivos.Animal;
import SeresVivos.Inseto;
import SeresVivos.Planta;

public class MainTeste {
    public static void main(String[] args) {

        Planta coqueiro = new Planta("Coquinho", "Coqueiro", "Brasil", 20, FamiliaPlanta.ARVORE, 5);
        Planta relva = new Planta("Verdinha", "Relva", "Portugal", 1, FamiliaPlanta.ERVA, 0);
        Planta ananas = new Planta("Casa do Spongebob", "Ananas", "Portugal", 1, FamiliaPlanta.FLOR, 3);
        Planta plantaCarnivora = new Planta("Come-insetos", "Carnivora", "Bolivia", 5, FamiliaPlanta.FLOR, 5);

        Inseto mosca = new Inseto("Chata", "Mosca", "Espanha", 2, false);
        Inseto tarantula = new Inseto("Aranha", "Tarântula Preta", "Australia", 4, true);
        Inseto formiga = new Inseto("Ant", "Formiga Vermelha", "Quénia", 2, true);

        Animal dumbo = new Animal("Dumbo", "Elefante", "África do Sul", 18, 800, 85, DietaAnimal.HERBIVORO, "Ihhhhhhhhhhh");
        Animal simba = new Animal("Simba", "Leão", "África do Sul", 12, 350, 50, DietaAnimal.CARNIVORO, "Rooooarrr");
        Animal golfinho = new Animal("Dolphi", "Golfinho", "Brasil", 8, 250, 96, DietaAnimal.CARNIVORO, "Ihh ihh ihh ihh");
        Animal rato = new Animal("Mickey", "Rato", "França", 4, 1, 75, DietaAnimal.OMNIVORO, "Uahh ah ah ah");
        Animal galinha = new Animal("Pintadinha", "Galinha", "China", 2, 4, 2, DietaAnimal.OMNIVORO, "Co co co ro co co");

        MeioAmbiente selva = new MeioAmbiente("Selva Estranha", 0.5);
        selva.adicionarSerVivo(coqueiro);   // 0
        selva.adicionarSerVivo(relva);      // 1
        selva.adicionarSerVivo(ananas);     // 2

        selva.adicionarSerVivo(mosca);      // 3
        selva.adicionarSerVivo(tarantula);  // 4
        selva.adicionarSerVivo(formiga);    // 5

        selva.adicionarSerVivo(dumbo);      // 6
        selva.adicionarSerVivo(simba);      // 7
        selva.adicionarSerVivo(golfinho);   // 8
        selva.adicionarSerVivo(rato);       // 9
        selva.adicionarSerVivo(galinha);    // 10

        selva.adicionarSerVivo(plantaCarnivora);  // 11

        selva.exibirSeresVivos();

        selva.plantaComeInseto(11);

        System.out.println("\n");

        selva.exibirSeresVivos();

    }
}
