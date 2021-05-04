import java.util.ArrayList;
import java.util.List;

public class Car {
    public List<Dimension> dimensionslist;
    public Manufacturer manufacturer;
    public Market market;
    public Country country;
    private String segment;
    public boolean isAutomatic;

    public Car(Manufacturer manufacturer, Market market,List<Dimension> dimensionslist, Country country, String segment, boolean isAutomatic) {
        this.dimensionslist = dimensionslist;
        this.manufacturer = manufacturer;
        this.market = market;
        this.country = country;
        this.segment = segment;
        this.isAutomatic = isAutomatic;
    }

    public String getSegment() {
        return segment;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public List<Dimension> getDimensionslist() {
        return dimensionslist;
    }

    public Market getMarket() {
        return market;
    }

    public Country getCountry() {
        return country;
    }



    @Override
    public String toString() {
        return "Model:" + manufacturer.getModel() +"\n" + " Type: " + manufacturer.getType() +"\n" + " MarketName:" + market.getMarketName() +" "
                +"\n" +" MarketCountry: " + country.getCountryName() +"\n"  +" Dimension: " + this.dimensionslist +"\n"  +" CountryName: " + country.getCountryName() +"\n"  + " CSign: " +country.getCountrySign() + " "
                +"\n"   +" Segment: " + segment+"\n"  + " " +"Transmission: " + isAutomatic +"\n" ;
    }

}
