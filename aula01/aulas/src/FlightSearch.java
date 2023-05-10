import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightSearch {

    public List<Flight> search(String origin, String destination, Date startDate, Date endDate) {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight(origin, destination, startDate, endDate, 300.0));
        flights.add(new Flight(origin, destination, startDate, endDate, 350.0));
        flights.add(new Flight(origin, destination, startDate, endDate, 400.0));

        return flights;
    }
}
