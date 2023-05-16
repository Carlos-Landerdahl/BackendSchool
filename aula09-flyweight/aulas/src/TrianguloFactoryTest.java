import factory.TrianguloFactory;
import model.Triangulo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TrianguloFactoryTest {

    @Test
    public void testeTriangulo() {
        Triangulo t1 = TrianguloFactory.getTriangulo("verde", 4);

        Assertions.assertEquals("verde", t1.getCor());
        Assertions.assertEquals(4, t1.getTamanho());
    }
}
