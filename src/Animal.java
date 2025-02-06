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

    public String getName() {
        return name;
    }
}
