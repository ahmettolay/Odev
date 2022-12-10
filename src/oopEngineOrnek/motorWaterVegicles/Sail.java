package oopEngineOrnek.motorWaterVegicles;

import oopEngineOrnek.property.Engine;
import oopEngineOrnek.property.MotorVehicle;

public class Sail extends  MotorWaterVehicles {

    private  String type;

    public Sail(String brand, int year, Engine engine, int numberOfEngine, int width, int height,
                boolean registry, String hullMaterial, int nuberOfCabin, String type) {
        super(brand, year, engine, numberOfEngine, width, height, registry, hullMaterial, nuberOfCabin);
        this.type = type;
    }

    public String type() {
        return type;
    }

    public Sail setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "Sail {" +
                " type = '" + type + '\'' +
                super.toString()+
                '}';
    }
}
