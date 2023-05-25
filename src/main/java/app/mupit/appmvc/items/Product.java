package app.mupit.appmvc.items;

public class Product {
    // tu zostaną dodane produkty do spożycia
    private static String productName;

    private static int productQuantity = 1;
    private static double productPrice;

    public Product(String productName, int productQuantity, double productPrice) {
        Product.productName = productName;
        Product.productQuantity = productQuantity;
        Product.productPrice = productPrice;
    }

    public static String getProductName() {
        return productName;
    }

    public static int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }
}

