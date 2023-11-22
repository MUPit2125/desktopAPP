package app.mupit.appmvc.items;

public class CarParts {
    // tu zostaną dodane części samochodowe

    private static String partName;
    private static int partQuantity = 1;
    private static double partPrice;

    public CarParts(String partName, int partQuantity, double partPrice) {
        CarParts.partName = partName;
        CarParts.partQuantity = partQuantity;
        CarParts.partPrice = partPrice;
    }

    public static String getPartName() {
        return partName;
    }

}
