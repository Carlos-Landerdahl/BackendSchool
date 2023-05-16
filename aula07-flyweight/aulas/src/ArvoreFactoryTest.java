import factory.ArvoreFactory;
import model.Arvore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArvoreFactoryTest {
    @Test
    public void testGetArvore() {
        Arvore arvoreOrnamental1 = ArvoreFactory.getArvore("Ornamental");
        Arvore arvoreOrnamental2 = ArvoreFactory.getArvore("Ornamental");
        Assertions.assertEquals(arvoreOrnamental1, arvoreOrnamental2);

        Arvore arvoreFrutifera1 = ArvoreFactory.getArvore("Frutífera");
        Arvore arvoreFrutifera2 = ArvoreFactory.getArvore("Frutífera");
        Assertions.assertEquals(arvoreFrutifera1, arvoreFrutifera2);

        Arvore arvoreFlorifera1 = ArvoreFactory.getArvore("Florífera");
        Arvore arvoreFlorifera2 = ArvoreFactory.getArvore("Florífera");
        Assertions.assertEquals(arvoreFlorifera1, arvoreFlorifera2);
    }

    @Test
    public void testeInputNomeArvore(){
        Arvore arvorePersonalizada = new Arvore(1000, 1000, "roxo", "ArvorePersonalizada");
        Arvore arvoreDoFactory = ArvoreFactory.getArvore("ArvorePersonalizada");
        Assertions.assertNotEquals(arvorePersonalizada, arvoreDoFactory);
    }
}
