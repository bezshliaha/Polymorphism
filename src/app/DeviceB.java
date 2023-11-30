package app;

public class DeviceB implements Device {
    private static final double
    CONSTANT_COEFFICIENT = 2.456;
    @Override
    public double calculateResult(double param1, double param2) {
        double baseResult = param1 + param2;
        return baseResult * CONSTANT_COEFFICIENT;

    }
}
