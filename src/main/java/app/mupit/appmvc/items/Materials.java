package app.mupit.appmvc.items;

public class Materials {
    // tu zostaną dodane materiały budowlane
    private static String nazwa;
    private static double cena;

    public Materials(String nazwa, double cena) {
        Materials.nazwa = nazwa;
        Materials.cena = cena;
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
