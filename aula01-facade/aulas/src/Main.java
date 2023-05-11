import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cria instâncias das classes de busca
        HotelSearch hotelSearch = new HotelSearch();
        FlightSearch flightSearch = new FlightSearch();

        TravelFacade facade = new TravelFacade(hotelSearch, flightSearch);

        // Define os parâmetros da busca
        String city = "Rio de Janeiro";
        Date startDate = new Date(2023, 5, 15);
        Date endDate = new Date(2023, 5, 22);

        // Realiza a busca de hotéis e voos
        List<Hotel> hotels = facade.searchHotels(city, startDate, endDate);
        List<Flight> flights = facade.searchFlights(city, startDate, endDate);

        // Exibe os resultados na tela
        System.out.println("Hotéis disponíveis:");
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }

        System.out.println("Voos disponíveis:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

}