package EstrategiasRota;

public class EstrategiaRotaNaval implements EstrategiaRota {

    public EstrategiaRotaNaval() {
    }


    @Override
    public void calcularRota(String origem, String destino) {
        System.out.println("A calcular uma rota de barco entre: " + origem + " e " + destino);
    }
}
