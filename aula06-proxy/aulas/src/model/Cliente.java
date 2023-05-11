package model;

public class Cliente {
    private String nome;
    private int ipUser;
    private String nomeFilme;

    public Cliente(String nome, int ipUser, String nomeFilme) {
        this.nome = nome;
        this.ipUser = ipUser;
        this.nomeFilme = nomeFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIpUser() {
        return ipUser;
    }

    public void setIpUser(int ipUser) {
        this.ipUser = ipUser;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
}
