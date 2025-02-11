import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal {

    public Fish(String name, LocalDate birthDate, List<String> vactination, String illness, String owner) {
        super(name, birthDate, vactination, illness, owner);
    }

//    @Override
//    protected void toGo() {
//        System.out.printf("%s no Go\n", getClass().getSimpleName());
//    }
//
//    @Override
//    protected void fly() {
//        System.out.printf("%s no fly\n", getClass().getSimpleName());
//    }
}
