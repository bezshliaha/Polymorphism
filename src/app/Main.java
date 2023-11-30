package app;

public class Main {
    public static void main(String[] args)
    {
        Device deviceA = new DeviceA();
        Device deviceB = new DeviceB();

        double resultA = Rounder.round(deviceA.calculateResult(8.3255, 4.52));
        double resultB = Rounder.round(deviceB.calculateResult(2.52, 3.52));

        System.out.println("Result DeviceA: " + resultA +
                           "\nResult Device B: " + resultB);
    }
}
