package PSTA;

public class ArtikelVergleich implements ArtikelVergleichInt {
    private int preis;
    private String name;

    public ArtikelVergleich(int m, String n) {
        setPreis(m);
        setName(n);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (n == null)
            throw new IllegalArgumentException();
        name = n;
    }

    public int getPreis() {
        return this.preis;
    }

    public void setPreis(int m) {
        if (m <= 0)
            throw new IllegalArgumentException();
        preis = m;
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof ArtikelVergleich))
            return false;

        ArtikelVergleich s = (ArtikelVergleich) o;

        return this.preis == s.preis && this.name.equals(s.name);
    }

    @Override
    public String toString() {
        return "Computer:  " + name + " [" + preis + "] € ";
    }

    public int compareTo(ArtikelVergleich o) {
        return Integer.compare(preis, o.preis);
    }

    //Die Verfügbaren Preise werden verglichen
    static void preisVergleich(ArtikelVergleich[] b) {
        for (ArtikelVergleich artikelVergleich : b) {
            System.out.println(artikelVergleich.toString());

        }
    }

}
