package EstrategiasRota;

public class EstrategiaRotaPedestre implements EstrategiaRota{

    public EstrategiaRotaPedestre() {
    }

    @Override
    public void calcularRota(String origem, String destino) {
        System.out.println("A calcular uma rota a pé entre: " + origem + " e " + destino);
    }
}
