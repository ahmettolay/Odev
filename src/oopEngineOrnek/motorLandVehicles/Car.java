package oopEngineOrnek.motorLandVehicles;

import oopEngineOrnek.property.Engine;
import oopEngineOrnek.property.MotorVehicle;

public class Car extends MotorLandVehicle {
    private int numberOfDoors;

    public Car(String brand, int year, Engine engine, String licensePlate, int numberOfWheels, int numberOfDoors) {
        super(brand, year, engine, licensePlate, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    public int numberOfDoors() {
        return numberOfDoors;
    }

    public Car setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    @Override
    public String toString() {
        return "Car {" +
                " numberOfDoors = " + numberOfDoors
                +super.toString()+
                '}';
    }
}
