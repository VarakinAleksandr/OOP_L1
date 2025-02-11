package Tip;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    private String name;
    private LocalDate birthDate;
    private List<String> vactination;
    private String illness;
    private String owner;

    public Animal(String name, LocalDate birthDate, List<String> vactination, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vactination = vactination;
        this.illness = illness;
        this.owner = owner;

    }

    private void wikeup() {
        System.out.println("Animal is wikeup !!!");
    }
    private void wikeup (int time){
        System.out.println("Animal is wikeup in " + time);
    }
    private void eat(){
        System.out.println("Animal is eating !!!");
    }
    private void play(){
        System.out.println("Animal is playing !!!");
    }
    private void sleep(){
        System.out.println("Animal is sleeping !!!");
    }
    public void lifeCycle(){
        wikeup();
        eat();
        play();
        sleep();
    }
//    protected void toGo(){
//        System.out.printf("%s Go\n", getClass().getSimpleName());
//    }
//    protected void fly(){
//        System.out.printf("%s fly\n", getClass().getSimpleName());
//    }
//    protected void swim(){
//        System.out.printf("%s swim\n", getClass().getSimpleName());
//    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vactination=" + vactination +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
