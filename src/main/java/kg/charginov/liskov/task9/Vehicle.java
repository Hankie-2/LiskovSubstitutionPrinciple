package kg.charginov.liskov.task9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Vehicle implements FuelConsumptionInterface {

    int seatPlace;

    String model;


    @Override
    public abstract void fuelCombustion(int fuel);

}
