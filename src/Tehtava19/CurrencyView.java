package Tehtava19;


import Tehtava19.CurrencyController;
import Tehtava19.Currency;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import java.sql.SQLException;

public class CurrencyView {

    private final CurrencyController controller;
    private final BorderPane root;

    private ComboBox<Currency> fromBox;
    private ComboBox<Currency> toBox;
    private TextField amountField;
    private TextField resultField;
    private Label errorLabel;

    public CurrencyView(CurrencyController controller) {
        this.controller = controller;
        this.root = new BorderPane();
        initialize();
    }

    private void initialize() {
        Label title = new Label("Currency Converter");

        amountField = new TextField();
        amountField.setPromptText("Enter amount");

        fromBox = new ComboBox<>();
        fromBox.getItems().addAll(controller.getAllCurrencies());
        fromBox.setPromptText("From currency");

        toBox = new ComboBox<>();
        toBox.getItems().addAll(controller.getAllCurrencies());
        toBox.setPromptText("To currency");

        resultField = new TextField();
        resultField.setEditable(false);
        resultField.setPromptText("Converted amount");

        Button convertBtn = new Button("Convert");

        Label instructions = new Label("Select currencies and enter an amount.");
        errorLabel = new Label();
        errorLabel.setStyle("-fx-text-fill: red;");

        convertBtn.setOnAction(e -> onConvert());

        VBox content = new VBox(10);
        content.setPadding(new Insets(20));
        content.getChildren().addAll(
                title,
                instructions,
                new Label("Amount:"),
                amountField,
                new Label("From:"),
                fromBox,
                new Label("To:"),
                toBox,
                convertBtn,
                new Label("Result:"),
                resultField,
                errorLabel
        );

        root.setCenter(content);
    }

    private void onConvert() {
        errorLabel.setText("");
        resultField.setText("");

        Currency from = fromBox.getValue();
        Currency to = toBox.getValue();

        if (from == null || to == null) {
            errorLabel.setText("Select both currencies.");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountField.getText().trim());
        } catch (NumberFormatException e) {
            errorLabel.setText("Invalid amount.");
            return;
        }

        try {
            double result = controller.convert(amount, from, to);
            resultField.setText(String.format("%.2f", result));
        } catch (SQLException e) {
            errorLabel.setText("Database error: " + e.getMessage());
        }
    }

    public BorderPane getRoot() {
        return root;
    }

    // Si quieres seguir usando show(Stage) como antes:
    public void show(Stage stage) {
        Scene scene = new Scene(getRoot(), 350, 450);
        scene.getStylesheets().add("style.css");
        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }
}

