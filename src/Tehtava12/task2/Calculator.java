package Tehtava12.task2;

public class Calculator {

    private int total;

    public Calculator() {
        this.total = 0;
    }

    // Nollaa laskurin arvon
    public void reset() {
        this.total = 0;
    }

    // Lisää positiivisen kokonaisluvun laskuriin
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Vain positiiviset kokonaisluvut ovat sallittuja.");
        }
        this.total += number;
    }

    // Palauttaa laskurin nykyisen arvon
    public int getValue() {
        return this.total;
    }

    // Pääohjelma luokan testaamiseen
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10);
        calc.add(20);
        System.out.println("Nykyinen summa: " + calc.getValue());
        calc.reset();
        System.out.println("Nollauksen jälkeen: " + calc.getValue());
    }
}

