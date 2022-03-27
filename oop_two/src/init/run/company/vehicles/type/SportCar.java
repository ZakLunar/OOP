package init.run.company.vehicles.type;

import init.run.company.details.Engine;
import init.run.company.professions.Person;
import init.run.company.vehicles.Car;

public class SportCar extends Car {
    private int speedLimit;

    public SportCar(String model, String carClass, double weight, Person driver, Engine engine, int speedLimit) {
        super(model, carClass, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString(){
        return super.toString() + ", Additional = max speed: " + speedLimit + " km/h";
    }
}
