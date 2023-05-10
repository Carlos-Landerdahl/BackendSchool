package aula05.service;

public class BaixarMusica implements IBaixar{

    @Override
    public void baixarMusica(Boolean userPremium, String username) {
        System.out.println(username + " baixou a música com sucesso!");
    }
}
