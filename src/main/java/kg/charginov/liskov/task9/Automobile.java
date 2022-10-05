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
public class Automobile extends GroundTransport{

    Boolean isMechanics;
    int kmH;

    public Automobile(String model, int seatPlace,int kmH, int numWheels, Boolean isMechanics) {
        super(model, seatPlace, numWheels);
        this.isMechanics = isMechanics;
        this.kmH = kmH;
    }

    @Override
    public void moveBackward() {
        out.println(model+" едет назад!");
    }

    @Override
    public void moveForward() {
        out.println(model+" едет вперед!");
    }

    @Override
    public void fuelCombustion(int fuel) {
        out.println("Наземный транспорт потребляет " + fuel + " литров и едет со скоростью " + kmH+" км ч");
    }

}
