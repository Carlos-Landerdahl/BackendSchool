package model;

public class Funcionarios extends Vendedores{

    Integer points = 0;
    Integer timeCompany;

    public Funcionarios(int timeCompany) {
        this.timeCompany = timeCompany;
    }

    public int getAfiliado() {
        int getAfiliado = 10;
        points += getAfiliado;

        return points;
    }

    public int calculateTime(int timeCompany){
        int antiguidade = 5;
        int total = antiguidade * timeCompany;

        points += total;
        return points;
    }
    
    @Override
    public int sell() {
        int newSell = 5;
        points += newSell;
        int points;
        return newSell;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getTimeCompany() {
        return timeCompany;
    }
    public void setTimeCompany(int timeCompany) {
        this.timeCompany = timeCompany;
    }

    public int getTempoEmpresa() {
        return 0;
    }

    public void obterAfiliado() {

    }
}
