package Tehtava5.task2;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar1;
        Car myCar2;

        myCar1 = new Car("Toyota Corolla",50,80);
        myCar2 = new Car("honda");


        myCar1.fillTank();
        myCar2.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar1.accelerate();
            System.out.println(myCar1.getTypeName() + ": speed is " + myCar1.getSpeed() + " km/h");
        }

        while (myCar1.getSpeed() > 0) {
            myCar1.decelerate(15);
            System.out.println(myCar1.getTypeName() + ": speed is " + myCar1.getSpeed() + " km/h");
        }

        for (int i = 0; i < 6; i++) {
            myCar2.accelerate();
            System.out.println(myCar2.getTypeName() + ": speed is " + myCar2.getSpeed() + " km/h");
        }

        while (myCar2.getSpeed() > 0) {
            myCar2.decelerate(15);
            System.out.println(myCar2.getTypeName() + ": speed is " + myCar2.getSpeed() + " km/h");
        }
    }
}
