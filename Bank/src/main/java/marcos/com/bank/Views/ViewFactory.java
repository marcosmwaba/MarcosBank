package marcos.com.bank.Views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
    //client views
    private AnchorPane dashboardView;

    public ViewFactory() {
    }

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml")).load();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        return dashboardView;
    }

    public void ShowLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/login.fxml"));
        Scene scene = null;

        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Marcos Bank");
        stage.show();
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Client.fxml"));
        Scene scene;

        try {
            scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Marcos Bank");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // You can log this instead
            throw new RuntimeException("Failed to load the client window.", e);
        }
    }

}
//this code ends here for while we resume in the next two months all the best


