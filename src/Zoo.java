import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void letAnimalSpeak(Animal animal){
        System.out.println(animal.speak());
    }

    public List<Animal> getAnimals(){
        return animals;
    }
}
