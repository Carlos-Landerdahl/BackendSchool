import factory.ArvoreFactory;
import model.Arvore;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 500_000; i++) {
            Arvore arvoreOrnamental = ArvoreFactory.getArvore("Ornamental");
            arvoreOrnamental.mostrar();

            Arvore arvoreFrutifera = ArvoreFactory.getArvore("Frutífera");
            arvoreFrutifera.mostrar();
        }

        for(int i = 0; i < 500_000; i++) {
            Arvore arvoreFlorifera = ArvoreFactory.getArvore("Florífera");
            arvoreFlorifera.mostrar();
        }

        Runtime runtime = Runtime.getRuntime();
        // totalMemory = memoria total
        // freeMemory = memoria livre
        // 1024 * 1024 = transforma bytes em megabytes (leitura melhor)
        //final = resultado de memoria usada pela maquina em megabytes
        System.out.println("Memória utilizada: "+ (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}