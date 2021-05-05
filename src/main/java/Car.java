import java.util.ArrayList;
import java.util.List;

public class Car {
    public List<Dimension> dimensionslist;
    public Manufacturer manufacturer;
    public Market market;
    public Country country;
    private String segment;
    public boolean isAutomatic;

    List<Car> carList;

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



    //search country
    public  String searchCar (String cars, List<Car> carList) {
        for (Car c : carList) {
            if (carList.size() > 0) {
                if ((c.isAutomatic == true)) { // sort transmission & return only true transmission
                    if (c.manufacturer.getType().equals(cars)) {  // this should only return cars that matched the search name
                        for (int i = 0; i < c.getDimensionslist().size(); i++) { //iterate through dimension to sort our search
                            if (c.getDimensionslist().get(i).getTankCapacityInltr() > 150) {
                                System.out.println("Country Name: " + c.country.getCountryName() + "\t"
                                        + "Country Sign: " + c.country.getCountrySign() + " \t");
                                break;
                            } else {
                                System.out.println("----cant find tank capacity less than the specified size");
                            }
                        }
                    } else {
                        System.out.println("--No tankCapacity matched your search value");
                    }
                } else {
                    System.out.println("--Attributes not found \n");
                }
            }
        }
        return cars;
    }

}
