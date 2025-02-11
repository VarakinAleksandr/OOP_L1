package Interfaces;

public interface Swiming {
        default void swim(){
        System.out.printf("%s swim\n", getClass().getSimpleName());
    }
}
