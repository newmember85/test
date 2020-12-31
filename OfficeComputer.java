package PSTA;

import java.util.ArrayList;

public class OfficeComputer<T> extends Computer implements PcSystem {

    private ArrayList<Computer> erstelltePCs;

    public OfficeComputer() {
        super();
        erstelltePCs = new ArrayList<>();
    }

    //Ein neuer Computer wird hinzugefügt
    public boolean addElement(Computer neuerPC) {
        for (Computer computerListe : erstelltePCs) {
            if (neuerPC.getName().equals(computerListe.getName())) {
                return false;
            }
        }
        erstelltePCs.add(neuerPC);
        return true;
    }

    //Name des Objects
    @Override
    public String getName() {
        String n = null;
        for (Computer computerListe : erstelltePCs) {
            n = computerListe.name;
        }
        return n;
    }

    @Override
    public int getSSD() {
        int number = 0;
        for (Computer daten : erstelltePCs) {
            number = daten.ssd;
        }
        return number;
    }

    //Überblick der Komponenten
    @Override
    public void getData() {
        getData(erstelltePCs);
    }

    static void getData(ArrayList<Computer> erstelltePCs) {
        for (Computer computerListe : erstelltePCs)
            System.out.println("Der Computer  " + computerListe.name + "  besitzt folgende Teile: " + "\n" + "Mainboard: " + computerListe.mainboard.name + "\t" + "CPU: " + computerListe.mainboard.cpu + "\t" + "RAM: " + computerListe.mainboard.ram + "\t" + "Grafikkarte: " + computerListe.mainboard.grafik + "\t" + "USB Ports: " + computerListe.mainboard.usbPorts + "\t" +
                    "\n" + "CPU Kühler: " + computerListe.cpuKühler + " SSD: " + computerListe.ssd + " Netztteil: " + computerListe.netzTeil + "\n");
    }

    //Preis eines Objects
    @Override
    public int getPreis() {
        int count = 0;
        for (Computer computerListe : erstelltePCs
        )
            count = computerListe.preis;
        return count;
    }


    public void setMainboardName(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : erstelltePCs) {
            mainboardListe.mainboard.name = name;
        }
    }

    public void setMainboardRam(int ram) {
        if (ram <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : erstelltePCs) {
            mainboardListe.mainboard.ram = ram;
        }
    }

    public void setMainboardGrafik(String grafik) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : erstelltePCs) {
            mainboardListe.mainboard.name = grafik;
        }
    }

    public void setMainboardUsbPorts(int usbPorts) {
        if (usbPorts <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : erstelltePCs) {
            mainboardListe.mainboard.usbPorts = usbPorts;
        }
    }

    public void setMainboardCPU(String cpu) {
        if (cpu == null) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : erstelltePCs) {
            mainboardListe.mainboard.cpu = cpu;
        }
    }

    @Override
    public void setNameComputer(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : erstelltePCs) {
            computerListe.name = name;
        }

    }

    @Override
    public void setCpuKühler(String cpuKühler) {
        if (cpuKühler == null) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : erstelltePCs) {
            computerListe.cpuKühler = cpuKühler;
        }
    }

    public String getCpuKühler() {
        String output = "";
        for (Computer computerListe : erstelltePCs) {
            output = computerListe.cpuKühler;
        }
        return output;
    }

    @Override
    public void setSsd(int ssd) {
        if (ssd <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : erstelltePCs) {
            computerListe.ssd = ssd;
        }
    }

    @Override
    public void setPreis(int preis) {
        if (preis <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : erstelltePCs) {
            computerListe.preis = preis;
        }
    }

}












