public class Parrot extends Animal{
    private String name;
    public Parrot(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "I am parrot";
    }
}
