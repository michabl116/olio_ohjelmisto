package Tehtava16.Controller;


import Tehtava16.Model.Currency;

public class CurrencyController {

    public double convert(double amount, Currency from, Currency to) {
        double amountInUSD = amount / from.getRateToUSD();
        return amountInUSD * to.getRateToUSD();
    }
}
