package oopEngineOrnek.motorWaterVegicles;

import oopEngineOrnek.property.Engine;

public class Yacht extends MotorWaterVehicles {
   private int numberOfBeds;
   private String engineBrand;

    public Yacht(String brand, int year, Engine engine, int numberOfEngine,
                 int width, int height, boolean registry, String hullMaterial,
                 int nuberOfCabin, int numberOfBeds, String engineBrand) {
        super(brand, year, engine, numberOfEngine, width, height, registry, hullMaterial, nuberOfCabin);
        this.numberOfBeds = numberOfBeds;
        this.engineBrand = engineBrand;
    }

    public int numberOfBeds() {
        return numberOfBeds;
    }

    public Yacht setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        return this;
    }

    public String engineBrand() {
        return engineBrand;
    }

    public Yacht setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
        return this;
    }

    @Override
    public String toString() {
        return "Yacht { " +
                " numberOfBeds = " + numberOfBeds +
                ", engineBrand = '" + engineBrand + '\'' + super.toString()+
                '}';
    }
}
