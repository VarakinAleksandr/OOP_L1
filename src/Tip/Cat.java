package Tip;

import Interfaces.Playing;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Playing {

    private int legsCount;

    public Cat(String name, LocalDate birthDate, List<String> vactination, String illness, String owner, int legsCount) {
        super(name, birthDate, vactination, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

//    @Override
//    protected void fly() {
//        System.out.printf("%s no fly\n", getClass().getSimpleName());
//    }
//
//    @Override
//    protected void swim() {
//        System.out.printf("%s no swim\n", getClass().getSimpleName());
//    }
}
