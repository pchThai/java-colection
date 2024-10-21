package src.main.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> setA = new LinkedHashSet<>();
        Set<String> setB = new HashSet<>();
        setA.add("Java");
        setA.add("PHP");
        setA.add("Golang");
        setA.add("Ruby");
    }
}
