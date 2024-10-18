package marcos.com.bank;

import javafx.application.Application;

import javafx.stage.Stage;
import marcos.com.bank.Models.Model;


public class App extends Application {
    @Override
    public void start(Stage Stage) {
        Model.getInstance().getViewFactory().ShowLoginWindow();

    }
}
