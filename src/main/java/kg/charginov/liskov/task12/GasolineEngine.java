package kg.charginov.liskov.task12;

public class GasolineEngine extends Engine{
    @Override
    public void enterToVehicle(Vehicle vehicle) {
        System.out.println("В транспортное средство " +vehicle.model + " установили бензиновый двигатель.");
    }
}
