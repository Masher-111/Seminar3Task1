import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
       // System.out.println("Hello world!");
    }
}

enum TypeCar{
    SEDAN,
    PICKUP

}

enum TypeFuel{
    GASOLIN,
    DIESEL

}

enum TypeGearBox{
    MT,
    AT

}


abstract class Car
{
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearboxType;
    private double engineCapacity;

    public void movement(){}
    public void maintenance(){}
    public boolean gearShifting(){return true; }
    public boolean switchHeadLight(){return true; }
    public boolean switchWipers(){return true; }


    public void setMake(String make) {this.make = make; }
    public String getMake() {return  make; }

    public void setModel(String model) {this.model = model; }
    public String getModel() {return  model; }

    public void setColor(Color color) {this.color = color; }
    public Color getColor() {return color; }

    public void setBodyType(TypeCar bodyType) {this.bodyType = bodyType; }
    public TypeCar getBodyType() {return  bodyType; }

    public void setNumberWheels(int numberWheels) {this.numberWheels = numberWheels; }
    public int getNumberWheels() {return  numberWheels; }

    public void setFuelType(TypeFuel fuelType) {this.fuelType = fuelType; }
    public TypeFuel getFuelType() {return  fuelType; }

    public void setGearbox(TypeGearBox gearboxType) {this.gearboxType = gearboxType; }
    public TypeGearBox getGearboxType() {return  gearboxType; }

    public void setEngineCapacity(double engineCapacity) {this.engineCapacity = engineCapacity; }
    public double getEngineCapacity() {return  engineCapacity; }

    //сконструировали класс
}

class PickUp extends Car implements  Refueling, Wiping
{
    private int loadCapacity;

    @Override
    public void fuel(){}
    @Override
    public void wipWindshield(){}
    @Override
    public void wipHeadLights(){}
    @Override
    public void wipMirrors(){}

    public int getLoadCapacity() {return loadCapacity; }
    public void setLoadCapacity(int loadCapacity) {this.loadCapacity = loadCapacity; }
}

class FutureCar extends Car
{
    FutureCar()
    {
        this.setNumberWheels(3);
    }

    @Override
    public void movement()
    {
        fly();
    }

    private void fly(){}

}

interface Refueling
{
    void fuel();

}

interface Wiping
{
    void wipWindshield();
    void wipHeadLights();
    void wipMirrors();
}
