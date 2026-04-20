package Tehtava15;

import Tehtava15.Controller.DictionaryController;
import Tehtava15.Model.Dictionary;
import Tehtava15.View.DictionaryView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Dictionary model = new Dictionary();
        DictionaryController controller = new DictionaryController(model);
        DictionaryView view = new DictionaryView(controller);

        view.show(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

