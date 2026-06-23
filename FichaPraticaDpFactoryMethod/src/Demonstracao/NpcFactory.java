package Demonstracao;

import java.util.Random;

public class NpcFactory {

    public static NPC inimigoFacil(){

        Random rd = new Random();

        int opcao= rd.nextInt(4);

        switch (opcao){
            case 0:
                return new NPC("Esqueleto",30,5);

            case 1:
                return new NPC("Goblin",15,10);

            case 2:
                return new NPC("Duende",32,7);

            case 3:
                return new NPC("Mosquito Chato",5,2);

            default:
                return null;
        }

    }

    public static NPC inimigoMedio(){

        Random rd = new Random();

        int opcao= rd.nextInt(3);

        switch (opcao){
            case 0:
                return new NPC("Dragão",50,25);

            case 1:
                return new NPC("Troll",90,8);

            case 2:
                return new NPC("Shrek",95,80);


            default:
                return null;
        }

    }

    public static NPC inimigoDificil(){

        Random rd = new Random();

        int opcao= rd.nextInt(3);

        switch (opcao){
            case 0:
                return new NPC("Sauron",250,20);

            case 1:
                return new NPC("Voldmort",50,100);

            case 2:
                return new NPC("Thanos",100,80);

            default:
                return null;
        }
    }

}
