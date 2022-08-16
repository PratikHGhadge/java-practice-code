package interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();

//        car.start();
//        car.acc();
//        car.stop();

        Media carMedia = new Car();
        carMedia.stop();
    }
}
