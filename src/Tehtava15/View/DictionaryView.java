package Tehtava15.View;


import Tehtava15.Controller.DictionaryController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView {

    private DictionaryController controller;

    public DictionaryView(DictionaryController controller) {
        this.controller = controller;
    }

    public void show(Stage stage) {
        TextField inputWord = new TextField();
        inputWord.setPromptText("Enter a word");

        TextField inputMeaning = new TextField();
        inputMeaning.setPromptText("Enter meaning");

        Button searchBtn = new Button("Search");
        Button addBtn = new Button("Add Word");

        TextArea output = new TextArea();
        output.setEditable(false);
        output.setPrefRowCount(4);

        searchBtn.setOnAction(e -> {
            String word = inputWord.getText();
            String meaning = controller.searchWord(word);
            output.setText(meaning);
        });


        addBtn.setOnAction(e -> {
            controller.addWord(inputWord.getText(), inputMeaning.getText());
            output.setText("Word added successfully!");
        });


        FlowPane root = new FlowPane();
        root.setPadding(new Insets(20));
        root.setVgap(10);
        root.setHgap(10);

        root.getChildren().addAll(
                new Label("Word:"),
                inputWord,
                new Label("Meaning:"),
                inputMeaning,
                searchBtn,
                addBtn,
                new Label("Result:"),
                output
        );

        Scene scene = new Scene(root, 400, 250);
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}
