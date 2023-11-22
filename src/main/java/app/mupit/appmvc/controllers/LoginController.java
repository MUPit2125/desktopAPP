package app.mupit.appmvc.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {

    private String pinCode = "";
    @FXML
    public ImageView loginLogo;
    @FXML
    public Label loginCurrentShopLabel;
    @FXML
    private AnchorPane loginPIN, loginSHOPS;
    @FXML
    public Button loginLoginLButton, loginLoginRButton, loginAboutButton,
            loginClearButton, loginExitButton, loginChangeShopButton,
            loginButton1, loginButton2, loginButton3,
            loginButton4, loginButton5, loginButton6,
            loginButton7, loginButton8, loginButton9,
            loginButtondot, loginButton00, loginButton0,
            bPowrot, bMechanika, bGastro, bBudowa;

    // po kliknięciu w button "wybierz sklep"
    @FXML
    public void changeShop() {
        System.out.println("Zmiana sklepu");

        loginPIN.setVisible(false);
        loginSHOPS.setVisible(true);
    }

    // po kliknięciu w button "bPowrot", "bMechanika", "bGastro" lub "bBudowa"
    @FXML
    private void choosePowrot() {
        System.out.println("Powrót do wcześniejszego sklepu");

        loginSHOPS.setVisible(false);
        loginPIN.setVisible(true);
    }

    @FXML
    private void chooseShop(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String shopName = clickedButton.getText();

        System.out.println("Zmiana sklepu na " + shopName);
        loginCurrentShopLabel.setText("OBECNY SKLEP: " + shopName);

        loginSHOPS.setVisible(false);
        loginPIN.setVisible(true);

        switch(shopName){
            case "GASTRO" -> loginLogo.setImage(new Image("restauracja.jpg"));
            case "BUDOWA" -> loginLogo.setImage(new Image("budowlanka.jpg"));
            case "MECHANIKA" -> loginLogo.setImage(new Image("mechanik.jpg"));
        }

    }


    @FXML
    public void exit() {
        System.out.println("zamykanie programu");
        Stage stage = (Stage) loginExitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void clear() {
        System.out.println("wyczyszczono co wprowadzono");
        pinCode = "";
    }

    @FXML
    public void about() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info o programie");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
        alert.showAndWait();
    }

    @FXML
    private void handleButtonClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();
        addPinCode(buttonText);
        System.out.println("Wprowadzony kod: " + pinCode);
//        System.out.println("KOD - " + buttonText);
    }

    private void addPinCode(String code) {
        pinCode += code;
    }

    public void switchToGastro(Stage stage) throws IOException {
        System.out.println("Przełączanie na scenę GASTRO");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/app/mupit/appmvc/gastroScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        System.out.println("Próba zalogowania");
        // Sprawdzenie czy kod PIN jest poprawny
        if (pinCode.equals("104")) {
            System.out.println("Kod PIN poprawny - zalogowano");
            // Przełączenie na scenę GASTRO
            switchToGastro((Stage) ((Node) event.getSource()).getScene().getWindow());
        } else {
            // Wyświetlenie komunikatu o błędzie
            System.out.println("Kod PIN niepoprawny - niezalogowano");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("BŁĘDNY KOD");
            alert.setHeaderText("Header Kod PIN niepoprawny");
            alert.showAndWait();
        }
        pinCode = "";
    }



}