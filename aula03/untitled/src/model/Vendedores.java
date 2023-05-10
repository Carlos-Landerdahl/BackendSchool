package model;

public abstract class Vendedores {
    int point;
    public String showCategory(int points){
        if (points > 40 ) {
            return "Vendedor categoria: Mestre";
        } else if (points > 30) {
            return "Vendedor categoria: Bom";
        } else if (points > 19) {
            return "Vendedor categoria: Aprendiz";
        } else {
            return "Vendedor categoria: Novato";
        }
    }

    public abstract int sell();
}
