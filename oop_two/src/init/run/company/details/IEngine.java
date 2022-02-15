package init.run.company.details;

public interface IEngine {
    default void start(){
        System.out.println("START!!");
    }
    default void stop(){
        System.out.println("STOP!");
    }
}
