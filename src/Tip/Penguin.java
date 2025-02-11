package Tip;

import Interfaces.Playing;
import Interfaces.Swiming;

import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal implements Playing, Swiming {
    public Penguin(String name, LocalDate birthDate, List<String> vactination, String illness, String owner) {
        super(name, birthDate, vactination, illness, owner);
    }
}
