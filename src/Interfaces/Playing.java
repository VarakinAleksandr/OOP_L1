package Interfaces;

public interface Playing {
    default void toGo(){
        System.out.printf("%s Go\n", getClass().getSimpleName());
    }
}
