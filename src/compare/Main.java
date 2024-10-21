package src.compare;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("An");
        Student studentB = new Student("An");
        Student studentC = null;
        System.out.println(studentA.equals(studentB));
        System.out.println(studentA.equals(studentC));
        System.out.println(studentC.equals(studentA));
    }
}
