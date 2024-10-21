package src.inteface;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.play();
        pet.eat();
        Animal animal= new Dog();
        animal.eat();
    }
}
