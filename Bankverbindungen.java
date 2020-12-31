package PSTA;

import java.util.*;


// Hier werden die einzelnen Bankverbindungen angezeigt und von wem sie sind
public class Bankverbindungen implements BankverbindungenInt {
    String artbankverbindung;
    private String kontoinhaber;
    private String kontonummer;
    private String datum;
    private String email;


    public Bankverbindungen(String kontoinhaber, String kontonummer, String datum, String email) {
        this.kontoinhaber = kontoinhaber;
        this.kontonummer = kontonummer;
        this.datum = datum;
        this.email = email;
    }

    public Bankverbindungen(String email) {
        this.email = email;
    }

    public void setKontoinhaber(String kontoinhaber) {
        if (kontoinhaber == null) {
            throw new IllegalArgumentException();
        }
        this.kontoinhaber = kontoinhaber;
    }

    public void setKontonummer(String kontonummer) {
        if (kontonummer == null) {
            throw new IllegalArgumentException();
        }
        this.kontonummer = kontonummer;
    }

    public void setDatum(String datum) {
        if (datum == null) {
            throw new IllegalArgumentException();
        }
        this.datum = datum;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException();
        }
        this.email = email;
    }

    Set<String> zahlungsarten = new HashSet<>();

    public void addBankverbin(String ab) {
        zahlungsarten.add(ab.toUpperCase());
    }

    public String getArtbankverbindung() {
        return artbankverbindung;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public String getDatum() {
        return datum;
    }

    public String getEmail() {
        return email;
    }

    public Set<String> getZahlungsarten() {
        return zahlungsarten;
    }


    @Override
    public String toString() {
        if (getKontonummer().length() < 20) {

            return "Kontonummer nicht korrekt";

        } else {

            if (getEmail() != null) {
                return "Bezahlung" + "\n" + "Kontoinhaber: " + getKontoinhaber() + "\n" + "Kontonummer: DE  " + getKontonummer() + "\n" + "Ablaufdatum " + getDatum() + "\n" + "Email " + getEmail() + "\n" + "Zahlungsarten " + getZahlungsarten() + "\n" + "Rabatt: " + getRabatt() + "€" + "\n" + " Zusatzksoten: " + getKosten() + "\n" + "Neuer Preis: ";
            } else
                return "Bezahlung" + "\n" + "Kontoinhaber: " + getKontoinhaber() + "\n" + "Kontonummer:  " + getKontonummer() + "\n" + "Ablaufdatum " + getDatum() + "\n" + "Zahlungsarten " + getZahlungsarten() + "\n" + "Rabatt: " + getRabatt() + "\n" + "Zusatzkosten: " + getKosten() + "€" + "\n" + "Neuer Preis: ";
        }
    }

    public int getRabatt() {
        return rabatt;
    }

    public int getKosten() {
        return kosten;
    }

    static int neuerPP = 0;
    static int neuerPV = 0;
    int rabatt = 0;

    //Rabatt durch "PAYPAL"
    @Override
    public int payPalrabatt(Set<String> n) {

        if (n.contains("PAYPAL")) {
            rabatt = -10;
        }
        neuerPP = neuerPP - rabatt;
        return rabatt;
    }

    //Zusätzliche Kosten durch "VISA"
    int kosten = 0;

    @Override
    public int zusatzKosten(Set<String> n) {

        if (n.contains("VISA")) {
            kosten = 10;
        }
        neuerPV = neuerPV + kosten;
        return kosten;
    }

    //Rabatt der Bankverbindungen wird vom Warenkorb Preis reduziert
    public static int neuerPreis(Integer n) {
        n = n - neuerPP + neuerPV;
        return n;
    }


}
