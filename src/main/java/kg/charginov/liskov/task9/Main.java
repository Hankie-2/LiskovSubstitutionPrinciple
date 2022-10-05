package kg.charginov.liskov.task9;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Vehicle v1 = new Aircraft("MIG-22",2,200);
        v1.fuelCombustion(22);

        GroundTransport v2 = new Automobile("Mazda",4,4,4,true);
        v2.fuelCombustion(33);
        v2.moveBackward();
        v2.moveForward();

    }
}

