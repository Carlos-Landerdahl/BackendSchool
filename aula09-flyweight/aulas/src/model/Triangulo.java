package model;

public class Triangulo {
    private String cor;
    private  Integer tamanho;

    public Triangulo(String cor, Integer tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public Integer getTamanho() {
        return tamanho;
    }
}
