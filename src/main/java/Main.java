import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static List<Car> carList = new ArrayList<>();
    public static List<Dimension> dimlist = new ArrayList<>();
    public static List<Country> clist;
    public static List<String> sorted;

    public static void main(String[] args) {


        Manufacturer manufacturer = new Manufacturer("xl", "Corolla");
        Country country = new Country("Spain", 'S');
        Market market = new Market("business", clist);


        //car manufacturer object and it's reference
        Manufacturer manufacturer1 = new Manufacturer("xl", "Corolla");
        Manufacturer manufacturer2 = new Manufacturer("xl", "Bmw");
        Manufacturer manufacturer3 = new Manufacturer("xl", "Bmw");
        Manufacturer manufacturer4 = new Manufacturer("xl", "corolla");
        Manufacturer manufacturer5 = new Manufacturer("xl", "Suzuki");
        Manufacturer manufacturer6 = new Manufacturer("xl", "Mazda");
        Manufacturer manufacturer7 = new Manufacturer("xl", "Toyota");
        Manufacturer manufacturer8 = new Manufacturer("xl", "Mazda");
        Manufacturer manufacturer9 = new Manufacturer("xl", "Bmw");
        Manufacturer manufacturer10 = new Manufacturer("xl", "corolla");


        //country object and reference
        Country country1 = new Country("Spain", 'S');
        Country country2 = new Country("Poland", 'P');
        Country country3 = new Country("Germany", 'G');
        Country country4 = new Country("France", 'F');
        Country country5 = new Country("China", 'C');


        //market obj & reference
        List<Country> c1 = Arrays.asList(new Country("Spain"));
        List<Country> c2 = Arrays.asList(new Country("Poland"));
        List<Country> c3 = Arrays.asList(new Country("Germany"));
        List<Country> c4 = Arrays.asList(new Country("France"));
        List<Country> c5 = Arrays.asList(new Country("China"));

        Market market1 = new Market("business", c1);
        Market market2 = new Market("Cargo", c2);
        Market market3 = new Market("Bus", c3);
        Market market4 = new Market("Taxi", c4);
        Market market5 = new Market("Bus", c5);


        //dimension object and reference
        List<Dimension> dim1 = Arrays.asList(new Dimension(34, 45, 234));
        List<Dimension> dim2 = Arrays.asList(new Dimension(44, 25, 380));
        List<Dimension> dim3 = Arrays.asList(new Dimension(24, 45, 330));
        List<Dimension> dim4 = Arrays.asList(new Dimension(14, 65, 350));
        List<Dimension> dim5 = Arrays.asList(new Dimension(54, 70, 140));
        List<Dimension> dim6 = Arrays.asList(new Dimension(74, 80, 200));
        List<Dimension> dim7 = Arrays.asList(new Dimension(44, 45, 370));
        List<Dimension> dim8 = Arrays.asList(new Dimension(64, 65, 90));
        List<Dimension> dim9 = Arrays.asList(new Dimension(54, 55, 390));
        List<Dimension> dim10 = Arrays.asList(new Dimension(34, 25, 400));


        Car car = new Car(manufacturer, market, dim1, country, "Cargo", false);
        carList.add(new Car(manufacturer1, market1, dim1, country1, "standard", true));
        carList.add(new Car(manufacturer2, market2, dim2, country2, "Business", false));
        carList.add(new Car(manufacturer3, market3, dim3, country3, "standard", true));
        carList.add(new Car(manufacturer4, market, dim4, country4, "Business", false));
        carList.add(new Car(manufacturer5, market5, dim5, country5, "standard", true));
        carList.add(new Car(manufacturer6, market5, dim6, country1, "Cargo", false));
        carList.add(new Car(manufacturer7, market4, dim7, country2, "Transport", true));
        carList.add(new Car(manufacturer8, market3, dim8, country3, "Bus", false));
        carList.add(new Car(manufacturer9, market2, dim9, country4, "Taxi", true));
        carList.add(new Car(manufacturer10, market1, dim10, country5, "Bus", false));

        //print all items
        for (Car c : carList) {
            //System.out.println(c);
        }

        // call search country
        //searchCar("Mazda");

       car.searchCar("Bmw",carList);


        //find country
        //System.out.println(findCountry("Poland"));
    }



    public static String findCountry(String country){
        int index = carList.indexOf(country);
        if(index >= 0 ){
            System.out.println(country);
        }
        return country;
    }

}





