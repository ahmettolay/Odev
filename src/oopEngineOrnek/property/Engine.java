package oopEngineOrnek.property;

public class Engine {

    private int enginePower;
    private int engineVolume;
    private FuelType fuelType;

    public Engine(int enginePower, int engineVolume, FuelType fuelType) {
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public int enginePower() {
        return enginePower;
    }

    public Engine setEnginePower(int enginePower) {
        this.enginePower = enginePower;
        return this;
    }

    public int engineVolume() {
        return engineVolume;
    }

    public Engine setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
        return this;
    }

    public FuelType fuelType() {
        return fuelType;
    }

    public Engine setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    @Override
    public String toString() {
        return "Engine {" +
                " enginePower = " + enginePower +
                ", engineVolume = " + engineVolume +
                ", fuelType = " + fuelType +
                '}';
    }
}
