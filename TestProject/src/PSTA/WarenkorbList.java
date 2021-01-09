package PSTA;

import java.util.*;

public class WarenkorbList<E> extends Kasse implements Warenkorb<E> {
    class Ware {
        E name;
        Ware next;

        Ware(E o, Ware e) {
            name = o;
            next = e;
        }
    }

    private Ware head;


    private Set<Integer> warenpreise = new TreeSet<>();
    private ArrayList<Integer> officelist = new ArrayList<>();

    public void add(E v, int j, String use) {
        // Hinzufügen der Preise
        if (use.equals("Private")) {
            warenpreise.add(j);
        } else {
            officelist.add(j);
        }

        if (head == null) {
            head = new Ware(v, null);
            return;
        }
        Ware it = head;
        while (it.next != null)
            it = it.next;
        it.next = new Ware(v, null);

    }

    // Konstruktor
    public WarenkorbList() {

    }

    //Preise werden bei mehreren durchgängen wieder auf stuffe 0 gesetzt
    public static int kostens2() {
        if (kosten2 > 0) {
            kosten2 = 0;
        }
        return kosten2;
    }

    //Preise werden bei mehreren durchgängen wieder auf stuffe 0 gesetzt
    public static int kostens1() {
        if (kosten > 0) {
            kosten = 0;
        }
        return kosten;
    }

    static int kosten = 0;
    static int kosten2 = 0;

    //Summe aller addiert
    public static int summeKosten() {

        return kosten + kosten2;
    }

    public void getInhalt() {
        if (head == null) {
            System.out.println("Warenkorb" + "\n" + 0 + "-Private " + 0 + "-Office-Artikel: " + warenString() + "\n" + "[ Private-Summe: " + +0 + "€ ] Rabatt " + 0 + " " + "[ Office-Summe: " + 0 + "€  Rabatt: " + 0 + "€ ]");
        } else {
            System.out.println("Warenkorb" + "\n" + warenpreise.size() + "-Private " + officelist.size() + "-Office-Artikel: " + warenString() + "\n" + "[ Private-Summe: " + +sumTreeSet() + "€ ] Rabatt " + (summe - rabatt) + " " + "[ Office-Summe: " + +sumOffice() + "€  Rabatt: " + discount + "€ ]");
        }


        Random rd = new Random();
        int s = rd.nextInt() & Integer.MAX_VALUE;

        HashMap<Double, E> bestellnummer = new HashMap<>();
        if (head == null) {
            return;
        }

        Ware it = head;
        String output = "";
        output = it.name.toString();
        if (head != null) {
            bestellnummer.put((double) Math.round(Math.random() * 100000), it.name);
        }


        while (it.next != null) {
            if (true) {
                it = it.next;
                output += ", " + it.name.toString();
                bestellnummer.put((double) Math.round(Math.random() * 100000), it.name);
            } else {
                it = it.next;
                output += "";

            }
        }

        System.out.println("\n" + "Vielen Dank für ihre Bestellung" + "\n" + "Hier ist ihre Bestellnummer: " + "\n" + bestellnummer.entrySet() + "\n");

    }


    private static int summe = 0;
    private int rabatt = 0;

    // Summe des Warenkorbs Set
    public int sumTreeSet() {
        int n = 0;
        for (Integer i : warenpreise) {
            n += i;
        }
        if (rabatt > 0) {
            n = rabatt;
        }
        kosten = kostens1();
        kosten = n + kosten;
        return n;
    }

    //Rabatt Code bei benutzung des Codes "OOP"
    public int rabattCode(String code) {
        int u = sumTreeSet();
        summe = u;
        if (code.equals("OOP")) {
            u = u - (15 * u) / 100;
            rabatt = u;

        } else {
            summe = 0;
        }
        return u;
    }


    static int discount = 0;

    public int sumOffice() {
        int n = 0;

        for (Integer i : officelist) {
            n += i;
        }

        if (officelist.size() > 4) {
            discount = n - officeApply(officelist.size(), n);
            n = officeApply(officelist.size(), n);
        }
        kosten2 = kostens2();
        kosten2 = n + kosten2;
        return n;
    }

    public int withoutRabatt() {
        int n = 0;

        for (Integer i : officelist) {
            n += i;
        }
        return n;
    }

    @Override
    public String toString() {
        int index = 0;
        if (head == null) {
            return "";
        }
        Ware it = head;
        String output = it.name.toString();
        while (it.next != null) {
            System.out.println(output);
            it = it.next;

            output += ", " + it.name.toString();
        }

        return output;
    }

    public String wertTester() {
        if (head == null) {
            return "Warenkorb ist leer";
        }
        Ware it = head;
        String output = it.name.toString();
        while (it.next != null) {
            if (!it.name.equals("Privat") && (!output.contains((CharSequence) it.next.name))) {
                it = it.next;
                output += ", " + it.name.toString();
            } else {
                it = it.next;
                output += "";
            }
        }
        return output;
    }

    public String warenString() {
        int index = 1;
        if (head == null) {
            return "Warenkorb ist leer";

        }
        Ware it = head;
        String output = it.name.toString();
        while (it.next != null) {
            if (!it.name.equals("Privat") && (!output.contains((CharSequence) it.next.name))) {
                it = it.next;
                output += ", " + it.name.toString();
            } else {
                it = it.next;
                index++;
                output += "";
            }

        }
        System.out.println();
        if (index > 2) {
            output += (" ::Preise für Private" + warenpreise + " Office Preise" + officelist + "\n" + "Sie hatten einen/mehrere Artikel mehrmals im Warenkorb");
        } else {
            output += (" ::Preise für Private" + warenpreise + " Office Preise" + officelist + "\n");
        }


        return output;
    }

    public void find(String a) {

        Ware it = head;
        while (it != null) {
            if (it.name.equals(a)) {
                System.out.println("Der Artikel: " + it.name + " wurde gefunden" + "\n");
                break;
            } else {
                it = it.next;
                System.out.println();

            }
        }
    }


    public <T> void delete(String data) {
        Ware it;
        Ware sol;

        it = head;
        sol = null;

        if (head == null) {
            throw new RuntimeException();
        }

        if (head.name.equals(data)) {
            head = head.next;
            return;
        }

        while (it != null && !it.name.equals(data)) {
            sol = it;
            it = it.next;

        }
        if (it == null)
            throw new RuntimeException();

        assert sol != null;
        sol.next = it.next;


    }
}







