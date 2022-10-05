package kg.charginov.liskov.task12;

public class DieselEngine extends Engine {
    @Override
    public void enterToVehicle(Vehicle vehicle) {
        System.out.println("В транспортное средство " +vehicle.model + " установили дизельный двигатель.");
    }
}
