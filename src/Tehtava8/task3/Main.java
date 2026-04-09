package Tehtava8.task3;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 8.0)
        };

        System.out.println("Shape Calculator\n");

        for (Shape s : shapes) {
            System.out.println(s.toString() + " \n → Area: " + s.calculateArea());
        }
    }
}

