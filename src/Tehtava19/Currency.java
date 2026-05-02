package Tehtava19;



public class Currency {

    private int id;
    private String code;
    private String name;
    private double baseRate;

    public Currency(int id, String code, String name, double baseRate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.baseRate = baseRate;
    }

    public Currency(String code, String name, double baseRate) {
        this(0, code, name, baseRate);
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getBaseRate() {
        return baseRate;
    }

    @Override
    public String toString() {
        return code + " - " + name;
    }
}

