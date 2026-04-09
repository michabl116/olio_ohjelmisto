package Tehtava8.task2;

public class Main {
    public static void main(String[] args) {
        Car normalCar = new Car("Normal Car", 50, 0);

        Bus bus = new Bus("City Bus", 50, 0);

        System.out.println("=== Normal Car ===");
        normalCar.accelerate();
        System.out.println("Speed: " + normalCar.getSpeed());


        System.out.println("\n=== Bus ===");
        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();
        System.out.println("Passengers: " + bus.getPassengers());
        bus.accelerate();
        System.out.println("Speed: " + bus.getSpeed());
        bus.passengerExit();
        System.out.println("Passengers:" + bus.getPassengers());

    }


}
