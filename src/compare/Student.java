package src.compare;

public class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof Student student){
            return this.name != null ? this.name.equals(student.getName()): student.getName() == null;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name != null ? this.name.hashCode() : 0;
    }
}
