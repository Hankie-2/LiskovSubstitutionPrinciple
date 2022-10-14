package kg.charginov.liskov.task12;

public class Automobile extends Vehicle implements Driveable{
    public Automobile(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Наземный транспорт ездит");
    }
}
