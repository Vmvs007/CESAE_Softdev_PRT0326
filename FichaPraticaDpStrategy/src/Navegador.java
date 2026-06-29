import EstrategiasRota.EstrategiaRota;

public class Navegador {

    private String username;
    private String email;
    private String paisOrigem;
    private EstrategiaRota estrategiaAtual;

    public Navegador(String username, String email, String paisOrigem, EstrategiaRota estrategiaAtual) {
        this.username = username;
        this.email = email;
        this.paisOrigem = paisOrigem;
        this.estrategiaAtual = estrategiaAtual;
    }

    public EstrategiaRota getEstrategiaAtual() {
        return estrategiaAtual;
    }

    public void setEstrategiaAtual(EstrategiaRota estrategiaAtual) {
        this.estrategiaAtual = estrategiaAtual;
    }

    public void mostrarRota(String origem, String destino) {
        this.estrategiaAtual.calcularRota(origem, destino);
    }
}
