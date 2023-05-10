import java.util.Date;
import java.util.List;

public class TravelFacade {

    private HotelSearch hotelSearch;
    private FlightSearch flightSearch;

    public TravelFacade(HotelSearch hotelSearch, FlightSearch flightSearch) {
        this.hotelSearch = hotelSearch;
        this.flightSearch = flightSearch;
    }

    public List<Hotel> searchHotels(String city, Date startDate, Date endDate) {
        return hotelSearch.search(city, startDate, endDate);
    }

    public List<Flight> searchFlights(String city, Date startDate, Date endDate) {
        String origin = city;
        String destination = city;
        return flightSearch.search(origin, destination, startDate, endDate);
    }
}