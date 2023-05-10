package aula05.model;

public class Pessoa {
    private String username;
    private Boolean usuarioPago;

    public Pessoa(String username, Boolean usuarioPago) {
        this.username = username;
        this.usuarioPago = usuarioPago;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getUsuarioPago() {
        return usuarioPago;
    }

    public void setUsuarioPago(Boolean usuarioPago) {
        this.usuarioPago = usuarioPago;
    }
}
