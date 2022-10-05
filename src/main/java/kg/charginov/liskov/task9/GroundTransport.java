package kg.charginov.liskov.task9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static java.lang.System.out;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class GroundTransport extends Vehicle implements MoveBackwardInterface,MoveForwardInterface {

    int numWheels;

    public GroundTransport(String model,int seatPlace, int numWheels) {
        super(seatPlace,model);
        this.numWheels = numWheels;
    }

    @Override
    public abstract void moveBackward();

    @Override
    public abstract void moveForward();

    @Override
    public abstract void fuelCombustion(int fuel);
}
