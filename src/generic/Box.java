package src.generic;

public class Box<T> {
    private T value;
    Box(T value){
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
