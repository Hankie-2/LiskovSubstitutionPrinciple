package kg.charginov.liskov.task12;

public class Airplane extends Vehicle implements Flyable{
    public Airplane(String model) {
        super(model);
    }

    @Override
    public void fly() {
        System.out.println("Воздушный транспорт летит");
    }
}
