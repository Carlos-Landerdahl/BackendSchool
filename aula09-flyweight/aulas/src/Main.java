import factory.TrianguloFactory;
import model.Triangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = TrianguloFactory.getTriangulo("verde", 4);
        System.out.println("Triângulo 1: " + t1.getCor() + " / " + t1.getTamanho());

        Triangulo t2= TrianguloFactory.getTriangulo("vermelho", 2);
        System.out.println("Triângulo 2: " + t2.getCor() + " / " + t2.getTamanho());

        Triangulo t3 = TrianguloFactory.getTriangulo("rosa", 4);
        System.out.println("Triângulo 3: " + t3.getCor() + " / " + t3.getTamanho());
    }
}
