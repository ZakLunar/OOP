package init.run;

import init.run.company.details.Engine;
import init.run.company.professions.Driver;
import init.run.company.professions.Person;
import init.run.company.vehicles.Car;
import init.run.company.vehicles.type.Lorry;
import init.run.company.vehicles.type.SportCar;

public class RUN_Car {
    public static void main(String[] args) {
        Person driverC = new Driver("Ed E.X.", 3);
        Person driverL = new Driver("Max R.A.", 5);
        Person driverS = new Driver("Zak S.W.", 7);

        Engine engineC = new Engine(240.9, "honda");
        Engine engineL = new Engine(932.2, "kraz");
        Engine engineS = new Engine(725.4, "dodge");

        Car carC = new Car("Honda Accord", "light", 1321.42, driverC, engineC);
        Car carL = new Lorry("Belaz", "lorry", 5441.32, driverL, engineL, 8500);
        Car carS = new SportCar("McLaren", "sport car", 982.83, driverS, engineS, 320);

        System.out.println("================ GET INFO ================");
        System.out.println(carC);
        System.out.println("================ Drive ================");
        engineC.start();
        carC.turnLeft();
        carC.turnRight();
        engineC.stop();

        System.out.println("================ GET INFO ================");
        System.out.println(carL);
        System.out.println("================ Drive ================");
        engineL.start();
        carL.turnLeft();
        carL.turnRight();
        engineL.stop();

        System.out.println("================ GET INFO ================");
        System.out.println(carS);
        System.out.println("================ Drive ================");
        engineS.start();
        carS.turnLeft();
        carS.turnRight();
        engineS.stop();

    }
}
