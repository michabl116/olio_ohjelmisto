package Tehtava5.task3;


public class CoffeeMaker {

    private boolean on;
    private String coffeeType;
    private int amount;

    public CoffeeMaker() {
        on = false;
        coffeeType = "normal";
        amount = 10;
    }

    public void pressOnOff() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public void setCoffeeType(String type) {
        if (on) {
            if (type.equals("normal") || type.equals("espresso")) {
                coffeeType = type;
            }
        }
    }

    public void setAmount(int ml) {
        if (on) {
            if (ml >= 10 && ml <= 80) {
                amount = ml;
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getAmount() {
        return amount;
    }
}

