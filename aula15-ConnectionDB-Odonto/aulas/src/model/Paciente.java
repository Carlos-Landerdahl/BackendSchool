package model;

public class Paciente {

    private int id;
    private String nome;
    private String sobreNome;
    private String rg;
    private String dataCadastro;
    private Endereco endereco;

    public Paciente(int id, String nome, String sobreNome, String rg, String dataCadastro, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    public Paciente(String nome, String sobreNome, String rg, String dataCadastro, Endereco endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", rg='" + rg + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
