package kg.charginov.liskov.task12;

public class Main {
    public static void main(String[] args) {
        Engine en1 = new DieselEngine();
        Engine en2 = new JetEngine();
        Engine en3 = new GasolineEngine();

        Vehicle v1 = new Airplane("BOEING-222");
        Vehicle v2 = new Automobile("Nissan Skyline");
        Vehicle v3 = new Automobile("LADA Calina");

        en1.enterToVehicle(v1);
        en2.enterToVehicle(v2);
        en3.enterToVehicle(v3);

    }
}
