package kg.charginov.liskov.task12;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Engine {

    int power;

    int fuelConsumption;

    public abstract void enterToVehicle(Vehicle vehicle);

}
