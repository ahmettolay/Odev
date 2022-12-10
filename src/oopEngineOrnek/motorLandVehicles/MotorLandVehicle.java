package oopEngineOrnek.motorLandVehicles;

import oopEngineOrnek.property.Engine;
import oopEngineOrnek.property.MotorVehicle;

public abstract class MotorLandVehicle extends MotorVehicle {
    private String licensePlate;
    private int numberOfWheels;


    public MotorLandVehicle(String brand, int year, Engine engine, String licensePlate, int numberOfWheels) {
        super(brand, year, engine);
        this.licensePlate = licensePlate;
        this.numberOfWheels = numberOfWheels;
    }


    public String licensePlate() {
        return licensePlate;
    }

    public MotorLandVehicle setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
        return this;
    }

    public int numberOfWheels() {
        return numberOfWheels;
    }

    public MotorLandVehicle setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public String toString() {
        return "  MotorLandVehicle {" +
                " licensePlate = '" + licensePlate + '\'' +
                ", numberOfWheels = " + numberOfWheels +
                super.toString()+
                '}';
    }
}
