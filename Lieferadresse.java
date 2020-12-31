package PSTA;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Lieferadresse implements LieferadresseInt {
    String name;
    String straße;
    String postleitzahl;
    String stadt;
    String bundesland;
    String land;

    public Lieferadresse(String name, String straße, String postleitzahl, String stadt, String bundesland, String land) {
        this.name = name;
        this.straße = straße;
        this.postleitzahl = postleitzahl;
        this.stadt = stadt;
        this.bundesland = bundesland;
        this.land = land;
    }

    public void setLand(String land) {
        if (land == null) {
            throw new IllegalArgumentException();
        }
        this.land = land;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public void setStraße(String straße) {
        if (straße == null) {
            throw new IllegalArgumentException();
        }
        this.straße = straße;
    }

    public void setPostleitzahl(String postleitzahl) {
        if (postleitzahl == null) {
            throw new IllegalArgumentException();
        }
        this.postleitzahl = postleitzahl;
    }

    public void setStadt(String stadt) {
        if (stadt == null) {
            throw new IllegalArgumentException();
        }
        this.stadt = stadt;
    }

    public void setBundesland(String bundesland) {
        if (bundesland == null) {
            throw new IllegalArgumentException();
        }
        this.bundesland = bundesland;
    }

    @Override
    public String toString() {
        String output = this.name + "\n" + this.straße + "\n" + this.postleitzahl + "\n" + this.stadt + "\n" + this.bundesland;
        return output;
    }

    public String getName() {
        return name;
    }

    public String getStraße() {
        return straße;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public String getStadt() {
        return stadt;
    }

    public String getBundesland() {
        return bundesland;
    }

    public String getLand() {
        return land;
    }

    List<String> t = new LinkedList<>();
    public static String u;

    public static String availableCountry() throws IOException {
        List<String> t = new LinkedList<>();
        t.add(u);

        String output = "";
        for (String s : t) {
            if (testData().contains(s)) {
                output = "Das Land steht zur Verfügung: " + s;
            } else
                output = "Wir liefern nicht in dieses Land [" + s + "]";

        }

        return output;
    }

    public static List<String> testData() throws IOException {
        AdressenCompare ca = new AdressenCompare(LänderReader.länderReader());
        List<String> ab = ca.länderDiffer();
        return ab;
    }

    public static String showCountrys() throws IOException {
        return testData().toString();
    }

    public static String findCountry(String country) throws IOException {
        List<String> suche = new LinkedList<>();
        suche.add(country);
        String output = "";
        for (String s : suche) {
            if (testData().contains(s)) {
                output = "[" + s + "] ist in der Liste";
            } else
                output = "Nicht in der Liste";

        }
        return output;
    }

    @Override
    public void formular() {
        u = getLand();
        System.out.print("Name: " + getName() + "\n" + "Starße:  " + getStadt() + "\n" + "Postleitzahl: " + getPostleitzahl() + "\n" + "Stadt: " + getStadt() + "\n" + "Bundesland: " + getBundesland() + "\n" + "Land: " + getLand() + "\n");
    }

}
