package app.mupit.appmvc.items;

public class Product {
    // tu zostaną dodane produkty do spożycia
    private static String nazwa;
    private static double cena;

    public Product(String nazwa, double cena) {
        Product.nazwa = nazwa;
        Product.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public static double getCena() {
        return cena;
    }

    public static double getCena(Object o) {
        return 0;
    }
}

