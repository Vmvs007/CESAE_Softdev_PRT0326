package SeresVivos;

import Enums.DietaAnimal;

public class Animal extends SerVivo {

    private double peso;
    private double inteligencia;
    private DietaAnimal dieta;
    private String barulho;
    private int diasComFome = 0;

    public Animal(String nome, String especie, String pais, int idade, double peso, double inteligencia, DietaAnimal dieta, String barulho) {
        super(nome, especie, pais, idade);
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.dieta = dieta;
        this.barulho = barulho;
    }

    public double getPeso() {
        return peso;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public DietaAnimal getDieta() {
        return dieta;
    }

    public String getBarulho() {
        return barulho;
    }

    public int getDiasComFome() {
        return diasComFome;
    }

    public void setDiasComFome(int diasComFome) {
        this.diasComFome = diasComFome;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.especie + " | " + this.pais + " | " + this.peso + " Kg. | " + this.dieta + " | QI: " + this.inteligencia + " | Dias sem comer: " + this.diasComFome);
    }
}
