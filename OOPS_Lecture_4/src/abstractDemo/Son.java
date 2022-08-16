package abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to a Doctor");
    }

    @Override
    void Partner() {
        System.out.println("I Love songs");
    }
}
