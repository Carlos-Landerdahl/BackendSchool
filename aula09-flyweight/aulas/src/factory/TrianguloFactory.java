package factory;

import model.Triangulo;

import java.util.HashMap;

public class TrianguloFactory {
    private static HashMap<String, Triangulo> trianguloMap = new HashMap<>();

    public static Triangulo getTriangulo(String cor, int tamanho) {
        String key = cor + tamanho;
        Triangulo triangulo = trianguloMap.get(key);

        if (triangulo == null) {
            triangulo = new Triangulo(cor, tamanho);
            trianguloMap.put(key, triangulo);
        }

        return triangulo;
    }
}
