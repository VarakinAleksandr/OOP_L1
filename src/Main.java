import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", LocalDate.of(2025,10,12),new ArrayList<>(),"Chumka", "Boss",10);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Eagle eagle = new Eagle("Kesha", LocalDate.of(2025,10,12),new ArrayList<>(),"Chumka", "Boss");
        System.out.println(eagle);
        List<Animal> animals = new ArrayList<>();
        animals.add(eagle);
        animals.add(barsik);
        System.out.println(animals);
        eagle.lifeCycle();
        eagle.fly();
        barsik.toGo();

    }
}