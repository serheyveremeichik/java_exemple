import java.util.*;

public class CarGenerator implements CarMovies {
    static int[] years  = {2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022};
    double [] engineVolume = {1.6, 1.8, 2.0, 2.5, 3.0};
    int [] numOfDoors = {2, 3, 4, 5};
    String [] bodyType = {"coupe", "sedan", "hatchback", "wagon"};
    String [] fuelType = {"gasoline", "diesel", "gas"};
    private static final List<CarBrands> VALUES = Arrays.asList(CarBrands.values());
    private static final Random RANDOM = new Random();
    public static CarBrands randomCarBrand()  {

        return VALUES.get(RANDOM.nextInt(VALUES.size()));
    }
    public static List<Car> carGenerator(int countCar) {

        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < countCar; i++){
            Car car = new Car();
            car.setBrand(randomCarBrand());
            car.setYear(years[RANDOM.nextInt(years.length)]);
            carList.add(car);
        }

        return carList;

    }

    public void start() {

    }

    public void stop() {

    }

    public double distance(double time, double speed) {
        return time*speed;
    }
}
