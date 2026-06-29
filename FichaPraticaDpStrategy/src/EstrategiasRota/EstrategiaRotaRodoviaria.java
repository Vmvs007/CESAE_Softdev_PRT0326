package EstrategiasRota;

public class EstrategiaRotaRodoviaria implements EstrategiaRota {

    public EstrategiaRotaRodoviaria() {
    }

    @Override
    public void calcularRota(String origem, String destino) {
        System.out.println("A calcular uma rota de carro entre: " + origem + " e " + destino);
    }
}
