package app.mupit.appmvc.controllers;

import app.mupit.appmvc.items.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderController {

    public Label idrachunku,
    dozaplaty,napiwek,zaplacono,sumadozaplaty,
    dozaplatycena,napiwekcena,zaplaconocena,sumadozaplatycena;
    @FXML
    private TableView<Product> rachunektabela;
    @FXML
    private TableColumn<Product, String> tabColName;
    @FXML
    private TableColumn<Product, Integer> tabColQuantity;
    @FXML
    private TableColumn<Product, Double> tabColPrice;
    public Button keypadButton1, keypadButton2, keypadButton3,
            keypadButton4, keypadButton5, keypadButton6,
            keypadButton7, keypadButton8, keypadButton9,
            keypadButton0, keypadButtondot, keypadButtonClear;
    public Button funcFunkcje, funcLobby, funcPlatnosc, funcBon, funcAnuluj;

    // opcje menu
    public Button Jedzenie, Napoje, Alko;

    // opcje jedzenia
    public Button Zupy, Glowne, Desery;
    public Button foodZupa1, foodZupa2, foodZupa3, foodZupa4, foodZupa5, foodZupa6;
    public Button foodGlowne1, foodGlowne2, foodGlowne3, foodGlowne4, foodGlowne5, foodGlowne6;
    public Button foodDeser1, foodDeser2, foodDeser3, foodDeser4, foodDeser5, foodDeser6;

    // opcje napojow
    public Button Gorace, Zimne, Bezalko;
    public Button napojeGorace1, napojeGorace2, napojeGorace3, napojeGorace4, napojeGorace5, napojeGorace6;
    public Button napojeZimne1, napojeZimne2, napojeZimne3, napojeZimne4, napojeZimne5, napojeZimne6;
    public Button napojeBezalko1, napojeBezalko2, napojeBezalko3, napojeBezalko4, napojeBezalko5, napojeBezalko6;

    // opcje alkoholi
    public Button Wino, Piwo, Koktajl;
    public Button alkoWino1, alkoWino2, alkoWino3, alkoWino4, alkoWino5, alkoWino6;
    public Button alkoPiwo1, alkoPiwo2, alkoPiwo3, alkoPiwo4, alkoPiwo5, alkoPiwo6;
    public Button alkoKoktajl1, alkoKoktajl2, alkoKoktajl3, alkoKoktajl4, alkoKoktajl5, alkoKoktajl6;
    public GridPane zupy, daniaglowne, desery, gorace, zimne, bezalko, wino, piwo, koktajl;
    public GridPane menuJedzenie, menuNapoje, menuAlkohole;

    int quantityValue = 1;

    public void handleKeypadClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonLabel = clickedButton.getText();
        System.out.println("Button " + buttonLabel + " clicked");
    }

/*
    @FXML
    private void chooseJedzenie() {
        System.out.println("menu - jedzenie");
        menuJedzenie.setVisible(true);
        menuNapoje.setVisible(false);
        menuAlkohole.setVisible(false);

        zupy.setVisible(false);
        daniaglowne.setVisible(false);
        desery.setVisible(false);
        gorace.setVisible(false);
        zimne.setVisible(false);
        bezalko.setVisible(false);
        wino.setVisible(false);
        piwo.setVisible(false);
        koktajl.setVisible(false);
    }

    @FXML
    private void chooseNapoje() {
        System.out.println("menu - napoje");
        menuJedzenie.setVisible(false);
        menuNapoje.setVisible(true);
        menuAlkohole.setVisible(false);

        zupy.setVisible(false);
        daniaglowne.setVisible(false);
        desery.setVisible(false);
        gorace.setVisible(false);
        zimne.setVisible(false);
        bezalko.setVisible(false);
        wino.setVisible(false);
        piwo.setVisible(false);
        koktajl.setVisible(false);
    }

    @FXML
    private void chooseAlko() {
        System.out.println("menu - alkohole");
        menuJedzenie.setVisible(false);
        menuNapoje.setVisible(false);
        menuAlkohole.setVisible(true);

        zupy.setVisible(false);
        daniaglowne.setVisible(false);
        desery.setVisible(false);
        gorace.setVisible(false);
        zimne.setVisible(false);
        bezalko.setVisible(false);
        wino.setVisible(false);
        piwo.setVisible(false);
        koktajl.setVisible(false);
    }

    @FXML
    private void chooseZupy() {
        System.out.println("menu - zupy");
        zupy.setVisible(true);
        daniaglowne.setVisible(false);
        desery.setVisible(false);
    }

    @FXML
    private void chooseGlowne() {
        System.out.println("menu - dania glowne");
        zupy.setVisible(false);
        daniaglowne.setVisible(true);
        desery.setVisible(false);
    }

    @FXML
    private void chooseDesery() {
        System.out.println("menu - desery");
        zupy.setVisible(false);
        daniaglowne.setVisible(false);
        desery.setVisible(true);
    }

    @FXML
    private void chooseGorace() {
        System.out.println("menu - gorace");
        gorace.setVisible(true);
        zimne.setVisible(false);
        bezalko.setVisible(false);
    }

    @FXML
    private void chooseZimne() {
        System.out.println("menu - zimne");
        gorace.setVisible(false);
        zimne.setVisible(true);
        bezalko.setVisible(false);
    }

    @FXML
    private void chooseBezalko() {
        System.out.println("menu - bezalko");
        gorace.setVisible(false);
        zimne.setVisible(false);
        bezalko.setVisible(true);
    }

    @FXML
    private void chooseWino() {
        System.out.println("menu - wino");
        wino.setVisible(true);
        piwo.setVisible(false);
        koktajl.setVisible(false);
    }

    @FXML
    private void choosePiwo() {
        System.out.println("menu - piwo");
        wino.setVisible(false);
        piwo.setVisible(true);
        koktajl.setVisible(false);
    }

    @FXML
    private void chooseKoktajl() {
        System.out.println("menu - koktajl");
        wino.setVisible(false);
        piwo.setVisible(false);
        koktajl.setVisible(true);
    }
    */

    @FXML
    private void chooseCategory(String category) {
        // dziala
//        System.out.println("Menu - " + category);

        // Wyłącz wszystkie elementy
        menuJedzenie.setVisible(false);
        menuNapoje.setVisible(false);
        menuAlkohole.setVisible(false);
        zupy.setVisible(false);
        daniaglowne.setVisible(false);
        desery.setVisible(false);
        gorace.setVisible(false);
        zimne.setVisible(false);
        bezalko.setVisible(false);
        wino.setVisible(false);
        piwo.setVisible(false);
        koktajl.setVisible(false);

        // Włącz odpowiednie elementy w zależności od wybranej kategorii
        switch (category) {
            case "Jedzenie" -> menuJedzenie.setVisible(true);
            case "Napoje" -> menuNapoje.setVisible(true);
            case "Alkohole" -> menuAlkohole.setVisible(true);
        }
    }
//    @FXML
//    private void chooseZupa() {
//        Product zupa = new Product("Zupa", 10.99);
//        // Dodaj zupę do tabeli lub listy produktów
//        rachunektabela.getItems().add(zupa);
//    }
    @FXML
    private void chooseSubcategory(String subcategory) {
        System.out.println("Menu - " + subcategory);

        // Wyłącz wszystkie pozycje
        zupy.setVisible(false);
        daniaglowne.setVisible(false);
        desery.setVisible(false);
        gorace.setVisible(false);
        zimne.setVisible(false);
        bezalko.setVisible(false);
        wino.setVisible(false);
        piwo.setVisible(false);
        koktajl.setVisible(false);

        // Włącz odpowiednie elementy w zależności od wybranej podkategorii
        switch (subcategory) {
            case "Zupy" -> zupy.setVisible(true);
            case "Dania główne" -> daniaglowne.setVisible(true);
            case "Desery" -> desery.setVisible(true);
            case "Gorące" -> gorace.setVisible(true);
            case "Zimne" -> zimne.setVisible(true);
            case "Bezalkoholowe" -> bezalko.setVisible(true);
            case "Wino" -> wino.setVisible(true);
            case "Piwo" -> piwo.setVisible(true);
            case "Koktajl" -> koktajl.setVisible(true);
        }
    }
/*
    @FXML
    private void handleJedzenieButtonClicked(ActionEvent event) {
        chooseCategory("Jedzenie");
    }
    @FXML
    private void handleNapojeButtonClicked(ActionEvent event) {
        chooseCategory("Napoje");
    }
    @FXML
    private void handleAlkoButtonClicked(ActionEvent event) {
        chooseCategory("Alkohole");
    }
    @FXML
    private void handleZupyButtonClicked(ActionEvent event) {
        chooseSubcategory("Zupy");
    }
    @FXML
    private void handleGlowneButtonClicked(ActionEvent event) {
        chooseSubcategory("Dania główne");
    }
    @FXML
    private void handleDeseryButtonClicked(ActionEvent event) {
        chooseSubcategory("Desery");
    }
    @FXML
    private void handleGoraceButtonClicked(ActionEvent event) {
        chooseSubcategory("Gorące");
    }
    @FXML
    private void handleZimneButtonClicked(ActionEvent event) {
        chooseSubcategory("Zimne");
    }
    @FXML
    private void handleBezalkoButtonClicked(ActionEvent event) {
        chooseSubcategory("Bezalkoholowe");
    }
    @FXML
    private void handleWinoButtonClicked(ActionEvent event) {
        chooseSubcategory("Wino");
    }
    @FXML
    private void handlePiwoButtonClicked(ActionEvent event) {
        chooseSubcategory("Piwo");
    }
    @FXML
    private void handleKoktajlButtonClicked(ActionEvent event) {
        chooseSubcategory("Koktajl");
    }*/

    @FXML
    private void handleCategoryButtonClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String category = clickedButton.getText();
        chooseCategory(category);
    }

    @FXML
    private void handleSubcategoryButtonClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String subcategory = clickedButton.getText();
        chooseSubcategory(subcategory);
    }
//
//    private void chooseCategory(String category) {
//        System.out.println("Menu - " + category);
//        // Logika wyświetlania odpowiednich elementów dla wybranej kategorii
//    }
//
//    private void chooseSubcategory(String subcategory) {
//        System.out.println("Menu - " + subcategory);
//        // Logika wyświetlania odpowiednich elementów dla wybranej podkategorii
//    }
//
//    @FXML
//    private void handleProductButtonClicked(ActionEvent event) {
//        Button clickedButton = (Button) event.getSource();
//        String productName = clickedButton.getText();
//        double productPrice = Product.getProductPrice(productName);
//
//        // Tworzenie nowego produktu
//        Product product = new Product(productName, 1, productPrice);
//
//        // Dodawanie produktu do tabeli "rachunek"
//        rachunektabela.getItems().add(product);
//    }

    @FXML
    private void handleNumericButtonClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonValue = clickedButton.getText();

        // Dodawanie klikniętej wartości do aktualnego ciągu
        quantityValue = Integer.parseInt(quantityValue + buttonValue);
    }

    public void cancel(ActionEvent event) throws IOException {
        System.out.println("wylogowano");
        Stage primaryStage = (Stage) funcBon.getScene().getWindow();
        Parent loginSceneRoot = FXMLLoader.load(getClass().getResource("/app/mupit/appmvc/gastroScene.fxml"));
        Scene loginScene = new Scene(loginSceneRoot);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public void backToLobby(ActionEvent event) throws IOException {
        System.out.println("wylogowano");
        Stage primaryStage = (Stage) funcBon.getScene().getWindow();
        Parent loginSceneRoot = FXMLLoader.load(getClass().getResource("/app/mupit/appmvc/gastroScene.fxml"));
        Scene loginScene = new Scene(loginSceneRoot);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public void tableConfirm(ActionEvent event) throws IOException {
        Button clickedButton = (Button) event.getSource();
        clickedButton.getStyleClass().add("clicked-table");

        Stage primaryStage = (Stage) funcBon.getScene().getWindow();
        Parent loginSceneRoot = FXMLLoader.load(getClass().getResource("/app/mupit/appmvc/gastroScene.fxml"));
        Scene loginScene = new Scene(loginSceneRoot);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

//    @FXML
//    private void chooseDanieGlowne() {
//        Product danieGlowne = new Product("Danie Główne", 25.99);
//        // Dodaj danie główne do tabeli lub listy produktów
//        rachunektabela.getItems().add(danieGlowne);
//    }

    @FXML
    private void handleProductClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        clickedButton.setDisable(true);
        clickedButton.setStyle("-fx-background-color: red;");

        // Pobierz wybrany produkt
        // (możesz zastosować odpowiednie metody dostępu
        // do danych w zależności od implementacji)

        Product selectedProduct = (Product) clickedButton.getUserData();

        // Dodaj wybrany produkt do tabeli
        rachunektabela.getItems().add(selectedProduct);

        // Oblicz sumę cen
        double sumaCen = rachunektabela.getItems().stream()
                .mapToDouble(Product::getProductPrice)
                .sum();


        // Uaktualnij Label "dozaplaty"
        dozaplaty.setText("Do zapłaty: " + sumaCen + " zł.");
    }


}