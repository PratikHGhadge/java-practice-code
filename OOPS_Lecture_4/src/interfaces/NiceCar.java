package interfaces;

public class NiceCar {
    private Engine engine;

    public NiceCar() {
        engine = new PowerEngine();
    }


    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}
