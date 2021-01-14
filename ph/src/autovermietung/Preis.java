package autovermietung;
import java.util.ArrayList;

public class Preis {
	private static int total = 0;
    private static int sUV = 80;
    private static int kleinwagen = 45;
    private static int mittelklasse = 65;
    private static int luxusklasse = 110;
    private static int schaltung = 0;
    private static int automatik = 20;



	
	// Berechne Preis SUV
    public static int berechnePreisSUV() {
    	total = 0;
    	total = total + sUV + automatik;
        return total;
    }
    
    public static int berechnePreisSUVSchaltung() {
    	total = 0;
    	total = total + sUV;
        return total;
    }
 // Berechne Preis Kleinwagen
    public static int berechnePreisKleinwagen() {
    	total = 0;
    	total = total + kleinwagen + automatik;
        return total;
    }
    
    public static int berechnePreisKleinwagenSchaltung() {
    	total = 0;
    	total = total + kleinwagen;
        return total;
    }
 // Berechne Preis Mittelklasse
    public static int berechnePreisMittelklasse() {
    	total = 0;
    	total = total + mittelklasse + automatik;
        return total;
    }

    public static int berechnePreisMittelklasseSchaltung() {
    	total = 0;
    	total = total + mittelklasse;
        return total;
    }
 // Berechne Preis Luxuxklasse
    public static int berechnePreisLuxusklasse() {
    	total = 0;
    	total = total + luxusklasse + automatik;
        return total;
    }

    public static int berechnePreisLuxusklasseSchaltung() {
    	total = 0;
    	total = total + luxusklasse;
        return total;
    }
    
    
    public static void main(String[] args) {


    }
}
