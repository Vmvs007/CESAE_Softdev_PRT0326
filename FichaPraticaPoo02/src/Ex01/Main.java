package Ex01;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Renault", "Clio", "Branco", 2005, 90, 1200, TipoCombustivel.DIESEL, 7);
        Carro carro2 = new Carro("Honda", "Civic", "Vermelho", 1999, 150, 1600, TipoCombustivel.GASOLINA, 12);
        Carro carro3 = new Carro("Ferrari", "SF90", "Vermelho", 2022, 600, 3000, TipoCombustivel.GASOLINA, 19);
        Carro carro4 = new Carro("Papa", "Reformas", "Amarelo", 1950, 700, 900, TipoCombustivel.ELETRICO, 3);

        Carro vencedor1 = carro1.corrida(carro2);
        System.out.println("__________ VENCEDOR CORRIDA 1 __________");
        vencedor1.exibirDetalhes();


        Carro vencedor2 = carro3.corrida(carro4);
        System.out.println("\n__________ VENCEDOR CORRIDA 2 __________");
        vencedor2.exibirDetalhes();


        System.out.println("\n\n__________ CORRIDA FINAL VAI COMEÇAR __________");
        vencedor1.ligar();
        vencedor2.ligar();

        Carro vencedorFinal = vencedor1.corrida(vencedor2);
        System.out.println("\n__________ VENCEDOR CORRIDA FINAL __________");
        vencedorFinal.exibirDetalhes();

    }
}
