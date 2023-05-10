package aula05;

import aula05.model.Pessoa;
import aula05.service.BaixarMusicaProxy;

public class Main {
    public static void main(String[] args) {
        BaixarMusicaProxy proxy = new BaixarMusicaProxy();

        Pessoa p1 = new Pessoa("Carlos", true);
        proxy.baixarMusica(p1.getUsuarioPago(), p1.getUsername());
    }
}
