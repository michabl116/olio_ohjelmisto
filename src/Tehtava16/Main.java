package Tehtava16;





import Tehtava16.Controller.CurrencyController;
import Tehtava16.Model.CurrencyModel;
import Tehtava16.View.CurrencyView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        CurrencyModel model = new CurrencyModel();
        CurrencyController controller = new CurrencyController();
        CurrencyView view = new CurrencyView(model, controller);

        view.show(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

