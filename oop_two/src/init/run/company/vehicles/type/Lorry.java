package init.run.company.vehicles.type;

import init.run.company.details.Engine;
import init.run.company.professions.Person;
import init.run.company.vehicles.Car;

public class Lorry extends Car {
    private double loadCapacity;

    public Lorry(String model, String carClass, double weight, Person driver, Engine engine, double loadCapacity) {
        super(model, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString(){
        return super.toString() + ", Additional = load capacity: " + loadCapacity + " kg";
    }
}
