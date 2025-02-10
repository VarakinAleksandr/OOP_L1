import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {

    private int legsCount;

    public Cat(String name, LocalDate birthDate, List<String> vactination, String illness, String owner, int legsCount) {
        super(name, birthDate, vactination, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }


}
