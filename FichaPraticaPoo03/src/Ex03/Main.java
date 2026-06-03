package Ex03;

public class Main {
    public static void main(String[] args) {

        Peixe sardinha = new Peixe("Sardinha",20,12);
        Peixe dourada = new Peixe("Dourada",15,17.5);
        Peixe salmao = new Peixe("Salmão",40,18);
        Peixe robalo = new Peixe("Robalo",75,20);

        Marisco ameijoa = new Marisco("Ameijoa",10,35);
        Marisco lagosta = new Marisco("Lagosta",30,100);
        Marisco camarao = new Marisco("Camarao",35,30);

        BarcoPesca bp = new BarcoPesca("Amor de Mãe","Azul e Branco",1985,3,100,Marca.BENTZ);

        bp.pescarPeixe(sardinha);
        bp.pescarPeixe(salmao);
        bp.pescarPeixe(robalo);

        bp.largarPeixe(salmao);

        bp.pescarMarisco(ameijoa);
        bp.pescarMarisco(lagosta);
        bp.pescarMarisco(camarao);

        System.out.println("\n");
        bp.exibirDetalhes();
    }
}
