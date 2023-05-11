import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelSearch {

    public List<Hotel> search(String city, Date startDate, Date endDate) {
        List<Hotel> hotels = new ArrayList<>();

        hotels.add(new Hotel("Hotel A", city, startDate, endDate, 100.0));
        hotels.add(new Hotel("Hotel B", city, startDate, endDate, 150.0));
        hotels.add(new Hotel("Hotel C", city, startDate, endDate, 200.0));

        return hotels;
    }
}
