package Tehtava8.task1;

public class Main {
    public static void main(String[] args) {
        Car normalCar = new Car("Normal Car", 50 , 0);
        SportsCar sportsCar = new SportsCar("Sports Car", 50, 0);
        System.out.println("=== Normal Car ===");
        normalCar.accelerate();
        System.out.println("Speed: " + normalCar.getSpeed());

        System.out.println("\n=== Sports Car ===");
        sportsCar.accelerate();
        System.out.println("Speed: " + sportsCar.getSpeed());
    }
}