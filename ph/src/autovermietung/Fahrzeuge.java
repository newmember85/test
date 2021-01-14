package autovermietung;


import java.util.ArrayList;

public class Fahrzeuge {
	
	private String kundenprofil;
	private String autoausgabe;
	private boolean muenchen;
	private boolean hamburg;
	private boolean berlin;
	private boolean rueckMuenchen;
	private boolean rueckHamburg;
	private boolean rueckBerlin;
	private boolean sUV;
	private boolean kleinwagen;
	private boolean mittelklasse;
	private boolean luxusklasse;
	private boolean schaltung;
	private boolean automatik;
	
	
	
	public Fahrzeuge(String Kundenprofil, String Autoausgabe,  boolean Muenchen, boolean Hamburg, boolean Berlin, boolean RueckMuenchen,
			boolean RueckHamburg, boolean RueckBerlin, boolean SUV, boolean Kleinwagen, boolean Mittelklasse,
			boolean Luxusklasse, boolean Schaltung, boolean Automatik) {
		super();
		this.kundenprofil = kundenprofil;
		this.autoausgabe = autoausgabe;
		this.muenchen = muenchen;
		this.hamburg = hamburg;
		this.berlin = berlin;
		this.rueckMuenchen = rueckMuenchen;
		this.rueckHamburg = rueckHamburg;
		this.rueckBerlin = rueckBerlin;
		this.sUV = sUV;
		this.kleinwagen = kleinwagen;
		this.mittelklasse = mittelklasse;
		this.luxusklasse = luxusklasse;
		this.schaltung = schaltung;
		this.automatik = automatik;

	}
}
