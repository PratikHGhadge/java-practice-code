package interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I Brak like a normal car ");
    }

    @Override
    public void start() {
        System.out.println("I Start engine like a normal car ");
    }

    @Override
    public void stop() {
        System.out.println("I Stop engine like a normal car ");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car ");
    }
}
