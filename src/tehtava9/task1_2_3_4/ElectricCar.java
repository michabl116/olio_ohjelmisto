package tehtava9.task1_2_3_4;



public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", "Electricity", "White", 4.0);
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}

