package Tehtava19;


import Tehtava19.Currency;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDao {

    private final Connection connection;

    public CurrencyDao(Connection connection) {
        this.connection = connection;
    }

    public double getRate(String code) throws SQLException {
        String sql = "SELECT base_rate FROM currencies WHERE code = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, code);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("base_rate");
                } else {
                    throw new SQLException("Currency not found: " + code);
                }
            }
        }
    }

    public List<Currency> getAllCurrencies() throws SQLException {
        List<Currency> list = new ArrayList<>();
        String sql = "SELECT id, code, name, base_rate FROM currencies ORDER BY code";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Currency c = new Currency(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getDouble("base_rate")
                );
                list.add(c);
            }
        }
        return list;
    }
}

