package interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
    }
}
