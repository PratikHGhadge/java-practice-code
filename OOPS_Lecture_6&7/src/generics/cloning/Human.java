package generics.cloning;

public class Human implements Cloneable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other){
        this.name = other.name;
        this.age = other.age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
