package Ex01LojaAvioesBoolean.Avioes;

public class Aviao {
    protected int serial;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double cmpFuselagem;
    protected double envAsas;
    protected double altCauda;
    protected int numMotores;
    protected double autonomia;
    protected double velMax;
    protected double preco;

    public Aviao(int serial, String modelo, int anoFabrico, double peso, double cmpFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.serial = serial;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.cmpFuselagem = cmpFuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public int getSerial() {
        return serial;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public double getPeso() {
        return peso;
    }

    public double getCmpFuselagem() {
        return cmpFuselagem;
    }

    public double getEnvAsas() {
        return envAsas;
    }

    public double getAltCauda() {
        return altCauda;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public double getVelMax() {
        return velMax;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println(this.serial + " | " + this.modelo + " | " + this.anoFabrico + " | Peso:" + this.peso + " Kg.");
        System.out.println("Num. Motores: " + this.numMotores + " | Vel. Max.: " + this.velMax + " Km/h" + " | " + this.preco + " €");
    }
}
