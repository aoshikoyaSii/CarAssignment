import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Market {
    private String marketName;
    List<Country> countries;

    public Market(String marketName, List<Country> countries) {
        this.marketName = marketName;
        this.countries = countries;
    }

    public String getMarketName() {
        return marketName;
    }

    public List<Country> getCountries() {
        return countries;
    }


    @Override
    public String toString() {
        return "countries=" + countries;

    }
}
