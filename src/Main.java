import Tip.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", LocalDate.of(2025,10,12),new ArrayList<>(),"Chumka", "Boss",10);
        Eagle eagle = new Eagle("Kesha", LocalDate.of(2025,10,12),new ArrayList<>(),"Chumka", "Boss");
        Fish forel = new Fish("Forel", LocalDate.of(2025,11,22),new ArrayList<>(),"Chumka", "Serg");
        Duck duck = new Duck("Donald", LocalDate.of(2025,11,22),new ArrayList<>(),"Fly", "Walter");
        Penguin penguin = new Penguin("Lolo", LocalDate.of(2025,11,22),new ArrayList<>(),"Lolo", "Gennadij");
        System.out.println(eagle);
        List<Animal> animals = new ArrayList<>();
        animals.add(eagle);
        animals.add(barsik);
        animals.add(forel);
        animals.add(duck);
        animals.add(penguin);
        System.out.println(animals);
        eagle.lifeCycle();
        eagle.fly();
        forel.swim();
        duck.toGo();



    }
}