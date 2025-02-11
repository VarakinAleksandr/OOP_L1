import Interfaces.Flying;
import Interfaces.Playing;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flying {


    public Eagle(String name, LocalDate birthDate, List<String> vactination, String illness, String owner) {
        super(name, birthDate, vactination, illness, owner);
    }

//    @Override
//    protected void swim() {
//        System.out.printf("%s no swim\n", getClass().getSimpleName());
//    }
}
