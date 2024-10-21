package src.inteface;

public class Dog implements Pet{
    @Override
    public void play() {
        System.out.println("Dog play");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}
