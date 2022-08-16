package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(28);
        daughter.career();
        daughter.Normal();

//        Parent mom = new Parent(); we can't create object of an abstract class

        Parent.Hello();


    }
}
