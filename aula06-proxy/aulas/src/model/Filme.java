package model;

public class Filme {
    private String nomeFilme;
    private int ipFilme;

    public Filme(String nomeFilme, int ipFilme) {
        this.nomeFilme = nomeFilme;
        this.ipFilme = ipFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getIpFilme() {
        return ipFilme;
    }

    public void setIpFilme(int ipFilme) {
        this.ipFilme = ipFilme;
    }
}
