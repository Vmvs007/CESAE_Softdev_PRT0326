import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Gato bigodes = new Gato("Bigodes","Persa");
        Sapo bolinhas = new Sapo("Bolinhas",1);
        Sapo pintinhas = new Sapo("Pintinha",1);
        Golfinho golfy = new Golfinho("Golfy","Azul");

        ArrayList<Terrestre> animaisTerra = new ArrayList<Terrestre>();
        animaisTerra.add(bigodes);
        animaisTerra.add(bolinhas);
        animaisTerra.add(pintinhas);

        ArrayList<Aquatico> animaisAgua = new ArrayList<Aquatico>();
        animaisAgua.add(golfy);
        animaisAgua.add(bolinhas);


    }
}
