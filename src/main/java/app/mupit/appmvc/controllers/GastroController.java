package app.mupit.appmvc.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GastroController {

    public ImageView lobbySchema;

    @FXML
    public Button table1, table2, table3, table4, table5, table6,
            table7, table8, table9, table10, table11, table12,
            table13, table14, table15, table16, table17, table18;
    @FXML
    public Button lobbyLogout;

    @FXML
    private void handleButtonClicked(ActionEvent event) {
        System.out.println("Zamówienie dla stolika nr " + ((Button) event.getSource()).getText() + " zostało przyjęte.");
        Button clickedButton = (Button) event.getSource();
        Stage primaryStage = (Stage) clickedButton.getScene().getWindow();

        try {
            Parent orderSceneRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/app/mupit/appmvc/orderScene.fxml")));
            Scene orderScene = new Scene(orderSceneRoot);
            primaryStage.setScene(orderScene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logout(ActionEvent event) throws IOException {
        System.out.println("wylogowano");
        Stage primaryStage = (Stage) lobbyLogout.getScene().getWindow();
        Parent loginSceneRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/app/mupit/appmvc/loginScene.fxml")));
        Scene loginScene = new Scene(loginSceneRoot);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }
}