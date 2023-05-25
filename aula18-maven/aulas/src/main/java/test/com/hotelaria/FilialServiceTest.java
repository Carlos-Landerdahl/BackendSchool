package test.com.hotelaria;

import com.hotelaria.config.ConfiguracaoJDBC;
import com.hotelaria.dao.impl.FilialDao;
import com.hotelaria.model.FilialHotel;
import com.hotelaria.service.FilialService;
import org.junit.Test;

import java.sql.SQLException;
import static org.junit.Assert.*;

public class FilialServiceTest {
    private static FilialService filialService= new FilialService(new FilialDao(new ConfiguracaoJDBC()));

    @Test
    public void testSalvarFilial() throws SQLException {

        FilialHotel f1 = new FilialHotel(1,"Martins", "Rua 1", 123, "Cidade1", "Estado1", true);
        FilialHotel f2 = new FilialHotel(2,"SoftwareHouse", "Rua 2", 456, "Cidade2", "Estado2", false);
        FilialHotel f3 = new FilialHotel(3,"Digital House", "Rua 3", 789, "Cidade3", "Estado3", true);
        FilialHotel f4 = new FilialHotel(4,"AWS Cloud", "Rua 4", 12, "Cidade4", "Estado4", false);
        FilialHotel f5 = new FilialHotel(5,"Google", "Rua 5", 345, "Cidade5", "Estado5", true);
        filialService.salvarFilial(f1);
        filialService.salvarFilial(f2);
        filialService.salvarFilial(f3);
        filialService.salvarFilial(f4);
        filialService.salvarFilial(f5);

        assertNotNull(String.valueOf(f1));
        assertNotNull(String.valueOf(f2));
        assertNotNull(String.valueOf(f3));
        assertNotNull(String.valueOf(f4));
        assertNotNull(String.valueOf(f5));
    }
}