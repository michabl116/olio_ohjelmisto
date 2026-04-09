package Tehtava8.task2;

public class Bus extends Car {

    private int passengers;
    public  Bus(String typeName, double gasolineLevel, double speed) {
        super(typeName, gasolineLevel, speed);
        passengers = 0;
    }
    @Override
    public void accelerate() {
        super.accelerate();
        super.accelerate();
        super.accelerate();

    }

    @Override
    void decelerate(int amount){

        super.decelerate(amount * 3);
    }


    public void passengerEnter() {
        passengers++;
    }

    public void passengerExit() {
        if (passengers > 0)
            passengers--;
    }

    public int getPassengers() {
        return passengers;
    }
}

