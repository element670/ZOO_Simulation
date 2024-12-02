//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("Billy Dog"));
        zoo.addAnimal(new Dog("Milly dog"));
        zoo.addAnimal(new Cat("Tiana Cat"));

        for (Animal animal : zoo.getAnimals()){
            zoo.letAnimalSpeak(animal);
        }
    }
}

