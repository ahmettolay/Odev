package oopEngineOrnek.property;

public class MotorVehicle {

    private String brand;
    private int year;
    private Engine engine;


    public MotorVehicle(String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public String brand() {
        return brand;
    }

    public MotorVehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int year() {
        return year;
    }

    public MotorVehicle setYear(int year) {
        this.year = year;
        return this;
    }

    public Engine engine() {
        return engine;
    }

    public MotorVehicle setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public String toString() {
        return "  MotorVehicle { " +
                " brand = '" + brand + '\'' +
                ", year = " + year +
                ",  engine = " + engine +
                '}';
    }
}
