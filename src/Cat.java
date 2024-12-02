public class Cat extends Animal{
    private String name;
    public Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "I am cat " + super.name;
    }
}
