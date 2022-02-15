package init.run.company.vehicles;

import init.run.company.details.Engine;
import init.run.company.professions.Person;

public class Car implements ICar{
    private final String model;
    private final String carClass;
    private final double weight;
    private final Person driver;
    private final Engine engine;

    public Car(String model, String carClass, double weight, Person driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Person getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }


    @Override
    public String toString(){
        return "Car = model: " + model +
                ", class: " + carClass +
                ", weight: " + weight +
                ", Driver = " + driver.getFio() +
                ", Engine = model: " + engine.getCompany() + ", power: " + engine.getPerformance();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
}
