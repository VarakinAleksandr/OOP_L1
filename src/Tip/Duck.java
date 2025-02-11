package Tip;

import Interfaces.Flying;
import Interfaces.Playing;
import Interfaces.Swiming;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Flying, Playing, Swiming {

    public Duck(String name, LocalDate birthDate, List<String> vactination, String illness, String owner) {
        super(name, birthDate, vactination, illness, owner);
    }
}
