package app;

public class DeviceA implements Device {
    @Override
    public double calculateResult(double param1, double param2) {
        return param1*param2;
    }
}
