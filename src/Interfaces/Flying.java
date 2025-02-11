package Interfaces;

public interface Flying {
    default void fly(){
        System.out.printf("%s fly\n", getClass().getSimpleName());
    }
}
