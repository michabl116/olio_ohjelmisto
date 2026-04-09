package Tehtava8.task1;

import java.util.stream.Stream;

public class SportsCar  extends Car{
    public  SportsCar(String typeName, double gasolineLevel, double speed) {
        super(typeName, gasolineLevel, speed);
    }

    @Override
    public void accelerate() {
            super.accelerate();
            super.accelerate();
        }

    @Override
    void decelerate(int amount){

        super.decelerate(amount * 2);
    }
}
