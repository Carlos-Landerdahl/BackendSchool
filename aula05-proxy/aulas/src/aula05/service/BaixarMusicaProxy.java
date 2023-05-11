package aula05.service;

public class BaixarMusicaProxy implements IBaixar{
    @Override
    public void baixarMusica(Boolean userPremium, String username) {
        if (userPremium){
            BaixarMusica baixarMusica = new BaixarMusica();
            baixarMusica.baixarMusica(userPremium, username);
            System.out.println(username +" tem a conta premium e baixou a música com sucesso!");
        }else {
            System.out.println("Não foi possível baixar a música, faça um upgrade no seu plano!");
        }
    }
}
