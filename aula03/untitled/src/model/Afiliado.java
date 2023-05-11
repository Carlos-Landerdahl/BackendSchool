package model;

public class Afiliado extends  Vendedores{

    int points = 0;

    @Override
    public int sell() {
        int novaVenda = 15;

        points += novaVenda;

        return points;
    }




    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
