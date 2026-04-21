package Tehtava16.View;



import Tehtava16.Controller.CurrencyController;
import Tehtava16.Model.Currency;
import Tehtava16.Model.CurrencyModel;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyView {

    private CurrencyModel model;
    private CurrencyController controller;

    public CurrencyView(CurrencyModel model, CurrencyController controller) {
        this.model = model;
        this.controller = controller;
    }

    public void show(Stage stage) {

        Label title = new Label("Currency Converter");

        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount");

        ComboBox<Currency> fromBox = new ComboBox<>();
        fromBox.getItems().addAll(model.getCurrencies());
        fromBox.setPromptText("From currency");

        ComboBox<Currency> toBox = new ComboBox<>();
        toBox.getItems().addAll(model.getCurrencies());
        toBox.setPromptText("To currency");

        TextField resultField = new TextField();
        resultField.setEditable(false);
        resultField.setPromptText("Converted amount");

        Button convertBtn = new Button("Convert");

        Label instructions = new Label("Select currencies and enter an amount.");

        convertBtn.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                Currency from = fromBox.getValue();
                Currency to = toBox.getValue();

                if (from == null || to == null) {
                    resultField.setText("Select both currencies.");
                    return;
                }

                double result = controller.convert(amount, from, to);
                resultField.setText(String.format("%.2f", result));

            } catch (Exception ex) {
                resultField.setText("Invalid input.");
            }
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
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
                resultField
        );

        Scene scene = new Scene(root, 350, 450);
        scene.getStylesheets().add("style.css");

        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }
}
