package model;

public class Arvore {
    private int altura;
    private int largura;
    private String cor;
    private String tipo;

    public Arvore(int altura, int largura, String cor, String tipo) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println(
                "Árvore do tipo: "+ this.tipo +
                        ", Cor: "+ this.cor +
                        ", Altura: "+ this.altura +
                        ", Largura: "+this.largura
        );
    }
}
