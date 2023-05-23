package app.mupit.appmvc.Panels.Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginPanel {

    String pinCode = "";
    @FXML
    public ImageView loginLogo;
    public Label loginCurrentShopLabel;
    public Button loginExitButton;
    public AnchorPane upperPane, bottomPane;

    public void login(ActionEvent event) {
        System.out.println("zalogowano");

    }

    public void changeShop(ActionEvent event) {
        System.out.println("Zmiana sklepu");
        loginCurrentShopLabel.setText("OBECNY SKLEP: "+"nowy sklep");
    }

    public void exit(ActionEvent event) {
        System.out.println("zamykanie programu");
        Stage stage = (Stage) loginExitButton.getScene().getWindow();
        stage.close();
    }

    public void clear(ActionEvent event) {
        System.out.println("wyczyszczono co wprowadzono");
        pinCode = "";
    }

    public void about(ActionEvent event) {
//        System.out.println("wyświetlanie info o programie - chce tu zrobić okno typu popup");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info o programie");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
        alert.showAndWait();
    }
}
