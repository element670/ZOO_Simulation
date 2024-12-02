public class Dog extends Animal{
    private String name;
    public Dog(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "I am dog " + super.name;
    }
}
