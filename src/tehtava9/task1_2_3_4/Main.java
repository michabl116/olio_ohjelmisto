package tehtava9.task1_2_3_4;
public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Motorcycle(),
                new Bus(),
                new ElectricCar(),
                new ElectricMotorcycle()
        };

        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle ---");
            v.start();
            v.stop();
            System.out.println(v.getInfo());
            System.out.println("Fuel Efficiency: " + v.calculateFuelEfficiency());

            if (v instanceof ElectricVehicle) {
                ((ElectricVehicle) v).charge();
            }
        }
    }
}
