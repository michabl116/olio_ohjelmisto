package Tehtava16.Model;


import java.util.ArrayList;
import java.util.List;

public class CurrencyModel {

    private List<Currency> currencies = new ArrayList<>();

    public CurrencyModel() {
        // Hardcoded currencies
        currencies.add(new Currency("USD", "US Dollar", 1.0));
        currencies.add(new Currency("EUR", "Euro", 0.92));
        currencies.add(new Currency("GBP", "British Pound", 0.80));
        currencies.add(new Currency("JPY", "Japanese Yen", 155.0));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }
}
