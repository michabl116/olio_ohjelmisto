package Tehtava19;

import Tehtava19.CurrencyController;
import Tehtava19.CurrencyDao;
import Tehtava19.MariaDbConnection;
import Tehtava19.CurrencyView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        CurrencyDao dao = new CurrencyDao(MariaDbConnection.getConnection());
        CurrencyController controller = new CurrencyController(dao);
        CurrencyView view = new CurrencyView(controller);
        view.show(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
