package tehtava9.task1_2_3_4;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
 String type;
 String fuel;
 String color;
 double fuelEfficiency;

public AbstractVehicle(String type, String fuel, String color, double fuelEfficiency) {
    this.type = type;
    this.fuel = fuel;
    this.color = color;
    this.fuelEfficiency = fuelEfficiency;
}

@Override
public void start() {
    System.out.println(type + " is starting...");
}

@Override
public void stop() {
    System.out.println(type + " is stopping...");
}

@Override
public String getInfo() {
    return "Type: " + type +
            "\nFuel: " + fuel +
            "\nColor: " + color;
}

@Override
public double calculateFuelEfficiency() {
    return fuelEfficiency;
}

@Override
public void charge() {
    System.out.println(type + ": Charging is not possible for this vehicle.");
}

}
