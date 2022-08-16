package interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }
}
