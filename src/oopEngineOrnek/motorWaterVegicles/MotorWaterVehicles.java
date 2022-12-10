package oopEngineOrnek.motorWaterVegicles;

import oopEngineOrnek.property.Engine;
import oopEngineOrnek.property.MotorVehicle;

public abstract class MotorWaterVehicles extends MotorVehicle {
   private int numberOfEngine;
    private  int width;
    private  int height;
    private  boolean registry;
    private  String hullMaterial;
    private  int nuberOfCabin;

    public MotorWaterVehicles(String brand, int year, Engine engine, int numberOfEngine,
                              int width, int height, boolean registry, String hullMaterial, int nuberOfCabin) {
        super(brand, year, engine);
        this.numberOfEngine = numberOfEngine;
        this.width = width;
        this.height = height;
        this.registry = registry;
        this.hullMaterial = hullMaterial;
        this.nuberOfCabin = nuberOfCabin;
    }

    public int numberOfEngine() {
        return numberOfEngine;
    }

    public MotorWaterVehicles setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
        return this;
    }

    public int width() {
        return width;
    }

    public MotorWaterVehicles setWidth(int width) {
        this.width = width;
        return this;
    }

    public int height() {
        return height;
    }

    public MotorWaterVehicles setHeight(int height) {
        this.height = height;
        return this;
    }

    public boolean registry() {
        return registry;
    }

    public MotorWaterVehicles setRegistry(boolean registry) {
        this.registry = registry;
        return this;
    }

    public String hullMaterial() {
        return hullMaterial;
    }

    public MotorWaterVehicles setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
        return this;
    }

    public int nuberOfCabin() {
        return nuberOfCabin;
    }

    public MotorWaterVehicles setNuberOfCabin(int nuberOfCabin) {
        this.nuberOfCabin = nuberOfCabin;
        return this;
    }

    @Override
    public String toString() {
        return "  MotorWaterVehicles {" +
                " numberOfEngine = " + numberOfEngine +
                ", width = " + width +
                ", height = " + height +
                ", registry = " + registry +
                ", hullMaterial = '" + hullMaterial + '\'' +
                ", nuberOfCabin = " + nuberOfCabin + super.toString()+
                '}';
    }
}
