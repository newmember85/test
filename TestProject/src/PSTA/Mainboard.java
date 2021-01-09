package PSTA;

public class Mainboard {

    public static PcSysteme<String> boardArt = new PcSysteme<>("Mainboard-Artikel Liste");
    public String name;
    String cpu;
    int ram;
    String grafik;
    int usbPorts;


    public Mainboard(String name, int ram, String grafik, int usbPorts, String cpu) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.grafik = grafik;
        this.usbPorts = usbPorts;
        boardArt.add(name);

    }

    //Ausgabe von der Mainboard Liste
    public static boolean ausgabe() {
        boardArt.getInhalt();
        return true;
    }

}
