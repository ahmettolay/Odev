package oopEngineOrnek;

import oopEngineOrnek.motorLandVehicles.Car;
import oopEngineOrnek.motorLandVehicles.MotorLandVehicle;
import oopEngineOrnek.motorWaterVegicles.Sail;
import oopEngineOrnek.motorWaterVegicles.Yacht;
import oopEngineOrnek.property.Engine;
import oopEngineOrnek.property.FuelType;
import oopEngineOrnek.property.MotorVehicle;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(120, 2, FuelType.PETROL);



        Car car1 = new Car("honda",2020,engine1,"34 AAA 34",4,4);
        System.out.println(car1);
        engine1.setEnginePower(150);
        System.out.println(car1);


        Engine engine2 = new Engine(120, 2, FuelType.PETROL);
        MotorVehicle motorVehicle2 = new MotorVehicle("honda", 1, engine1);


        Sail sail1 = new Sail("Marka",2020,engine2,2,100,100,true,"iron",
                150,"Race");
        System.out.println(sail1);
        sail1.setHullMaterial("chrome");
        System.out.println(sail1);

        Yacht yacht1=new Yacht("Abacus",2000,engine2,120,150,150,true,"iron",
                101,2,"Mitsubishi");
        System.out.println(yacht1);
    }
}
