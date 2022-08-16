package abstractDemo;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void Hello(){
        System.out.println("hey");
    }

    void Normal(){
        System.out.println("this is normal method ");
    }

    abstract void career();
    abstract void Partner();
}
