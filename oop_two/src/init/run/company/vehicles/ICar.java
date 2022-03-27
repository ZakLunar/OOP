package init.run.company.vehicles;

public interface ICar {
    default void turnRight(){
        System.out.println("Turn right");
    }
    default void turnLeft(){
        System.out.println("Turn left");
    }
}
