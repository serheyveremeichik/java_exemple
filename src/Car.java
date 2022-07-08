public class Car {

    CarBrands brand;
    String model;

    String bodyType;
    double engineVolume;
    int numOfDoors;
    String fuelType;
    int year;

    public Car() {
    }

    public Car(CarBrands brand, String model, String bodyType, double engineVolume, int numOfDoors, String fuelType, int year) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.engineVolume = engineVolume;
        this.numOfDoors = numOfDoors;
        this.fuelType = fuelType;
        this.year = year;
    }

    public CarBrands getBrand() {
        return brand;
    }

    public void setBrand(CarBrands brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car brand=" + brand
                + ", car year=" + year
                + ", car body=" + bodyType
                + ", car fuel type=" + fuelType + "]";
    }
}
