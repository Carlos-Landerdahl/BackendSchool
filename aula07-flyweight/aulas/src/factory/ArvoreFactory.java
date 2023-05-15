package factory;

import model.Arvore;

import java.util.HashMap;

public class ArvoreFactory {
    private static HashMap<String, Arvore> avoresMap = new HashMap<>();

    public static Arvore getArvore(String tipo) {
        Arvore arvore = avoresMap.get(tipo);

        if(arvore == null) {
            switch (tipo) {
                case "Ornamental":
                    arvore = new Arvore(200, 400, "verde", "Ornamental");
                    break;
                case "Frutífera":
                    arvore = new Arvore(500, 300, "vermelho", "Frutífera");
                    break;
                case "Florífera":
                    arvore = new Arvore(100, 200, "azul", "Florífera");
                    break;
            }
            avoresMap.put(tipo, arvore);
        }
        return arvore;
    }

}
