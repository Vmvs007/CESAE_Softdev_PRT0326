package Ex03;

public class Marisco {
    private String especie;
    private double pesoKg;
    private double precoKg;

    public Marisco(String especie, double pesoKg, double precoKg) {
        this.especie = especie;
        this.pesoKg = pesoKg;
        this.precoKg = precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public void exibirDetalhes(){
        System.out.println(this.especie+ " | Peso: "+this.pesoKg+" Kg. | Preço: "+this.precoKg+" €/Kg.");
    }
}
