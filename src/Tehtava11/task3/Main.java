package Tehtava11.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student s = new Student(1, "Alice", 22);
        Course c = new Course("CS101", "Intro to Programming", "Dr. Smith");
        Enrollment e = new Enrollment(s, c, "2023-01-15");


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tehtava11/task3/enrollments.ser"))) {
            out.writeObject(e);
            System.out.println("Object serialized successfully.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tehtava11/task3/enrollments.ser"))) {
            Enrollment loaded = (Enrollment) in.readObject();
            System.out.println("Deserialized object:");
            System.out.println(loaded);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
