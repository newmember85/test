package PSTA;

public class Computer implements ComputerInt {
    String cpuKühler;
    int ssd;
    String netzTeil;
    Mainboard mainboard;
    String name;
    int preis;

    private Computer(Mainboard mainboard, String cpuKühler, int ssd, String netzT, String name, int preis) {
        this.name = name;
        this.cpuKühler = cpuKühler;
        this.ssd = ssd;
        this.netzTeil = netzT;
        this.mainboard = mainboard;
        this.preis = preis;

    }

    Computer() {

    }

    public static Computer erstelleOffice(Mainboard mainboard, String cpuKühler, int ssd, String netzT, String name, int preis) {
        return new Computer(mainboard, cpuKühler, ssd, netzT, name, preis);
    }

    public static Computer erstellePrivat(Mainboard mainboard, String cpuKühler, int ssd, String netzT, String name, int preis) {
        return new Computer(mainboard, cpuKühler, ssd, netzT, name, preis);
    }

    @Override
    public int getPreis() {
        return preis;
    }

    @Override
    public void setPreis(int m) {
        if (m <= 0)
            throw new IllegalArgumentException();
        preis = m;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSSD() {
        return ssd;
    }

    public void getData() {
    }

    @Override
    public void setSsd(int ssd) {
        if (ssd <= 0) {
            throw new IllegalArgumentException();
        }
        this.ssd = ssd;
    }
}



