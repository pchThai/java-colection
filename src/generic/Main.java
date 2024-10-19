package src.generic;

public class Main {
    public static void main(String[] args) {
        Box<Integer> testInterger = new Box<Integer>(1);
        System.out.println("Value: "+ testInterger.getValue());

        Box<Double> testDouble = new Box<Double>(1.2);
        System.out.println("Value: "+ testDouble.getValue());

        Box<String> testString = new Box<>("String");
        System.out.println("Value: "+ testString.getValue());
    }
}
