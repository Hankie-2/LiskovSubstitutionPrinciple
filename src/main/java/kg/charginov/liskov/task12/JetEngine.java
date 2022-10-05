package kg.charginov.liskov.task12;

public class JetEngine extends Engine{
    @Override
    public void enterToVehicle(Vehicle vehicle) {
        System.out.println("В транспортное средство " +vehicle.model + " установили реактивный двигатель.");
    }
}
