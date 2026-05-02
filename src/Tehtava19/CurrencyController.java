package Tehtava19;

import Tehtava19.CurrencyDao;
import Tehtava19.Currency;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class CurrencyController {

    private CurrencyDao dao;

    public CurrencyController(CurrencyDao dao) {
        this.dao = dao;
    }

    // NUEVO: cargar divisas desde BD
    public List<Currency> getAllCurrencies() {
        try {
            return dao.getAllCurrencies();
        } catch (SQLException e) {
            System.err.println("Error loading currencies: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    // NUEVO: convertir usando BD
    public double convert(double amount, Currency from, Currency to) throws SQLException {
        double fromRate = dao.getRate(from.getCode());
        double toRate = dao.getRate(to.getCode());
        return amount * (toRate / fromRate);
    }
}
