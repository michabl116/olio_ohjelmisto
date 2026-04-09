package tehtava9.task1_2_3_4;



 class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", "Blue", 2.0);
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}

