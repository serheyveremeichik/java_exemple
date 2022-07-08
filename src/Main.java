import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> listCar = CarGenerator.carGenerator(5);
        for (Car car : listCar){
            System.out.println(car.toString());
        }

    }
}
