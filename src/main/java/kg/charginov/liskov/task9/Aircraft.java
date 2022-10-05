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
public class Aircraft extends Vehicle{

    int rangeOfFlight;

    public Aircraft(String model,int seatPlace, int rangeOfFlight) {
        super(seatPlace,model);
        this.rangeOfFlight = rangeOfFlight;
    }

    @Override
    public void fuelCombustion(int fuel) {
        out.println("Воздушный транспорт потребляет "+ fuel + " литров и летит на расстояние " + rangeOfFlight + " км");
    }
}
