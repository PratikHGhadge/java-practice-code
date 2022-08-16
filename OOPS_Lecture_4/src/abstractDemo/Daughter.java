package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder ");
    }

    @Override
    void Partner() {
        System.out.println("I Love Iron man ");
    }
}
