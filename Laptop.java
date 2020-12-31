package PSTA;

import java.util.ArrayList;

public class Laptop extends Computer implements PcSystem {


    private ArrayList<Computer> head;

    public Laptop() {
        head = new ArrayList<>();
    }

    public boolean addElement(Computer neuerPC) {
        for (Computer computerListe : head) {
            if (neuerPC.getName().equals(computerListe.getName())) {
                return false;
            }
        }
        head.add(neuerPC);
        return true;
    }

    //Name des Objects
    @Override
    public String getName() {
        String n = null;
        for (Computer computerListe : head) {
            n = computerListe.name;
        }
        return n;
    }

    @Override
    public int getSSD() {
        int number = 0;
        for (Computer daten : head) {
            number = daten.ssd;
        }
        return number;
    }

    //Überblick der Komponenten
    @Override
    public void getData() {
        OfficeComputer.getData(head);
    }

    //Preis eines Objects
    @Override
    public int getPreis() {
        int count = 0;
        for (Computer computerListe : head
        )
            count = computerListe.preis;
        return count;
    }

    public void setMainboardName(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : head) {
            mainboardListe.mainboard.name = name;
        }
    }

    public void setMainboardRam(int ram) {
        if (ram <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : head) {
            mainboardListe.mainboard.ram = ram;
        }
    }


    public void setMainboardGrafik(String grafik) {
        if (grafik == null) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : head) {
            mainboardListe.mainboard.name = grafik;
        }
    }

    public void setMainboardUsbPorts(int usbPorts) {
        if (usbPorts <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : head) {
            mainboardListe.mainboard.usbPorts = usbPorts;
        }
    }

    public void setMainboardCPU(String cpu) {
        if (cpu == null) {
            throw new IllegalArgumentException();
        }
        for (Computer mainboardListe : head) {
            mainboardListe.mainboard.cpu = cpu;
        }
    }

    @Override
    public void setNameComputer(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : head) {
            computerListe.name = name;
        }
    }

    @Override
    public void setCpuKühler(String cpuKühler) {
        if (cpuKühler == null) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : head) {
            computerListe.cpuKühler = cpuKühler;
        }
    }

    public String getCpuKühler() {
        String output = "";
        for (Computer computerListe : head) {
            output = computerListe.cpuKühler;
        }
        return output;
    }

    @Override
    public void setSsd(int ssd) {
        if (ssd <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : head) {
            computerListe.ssd = ssd;
        }
    }

    @Override
    public void setPreis(int preis) {
        if (preis <= 0) {
            throw new IllegalArgumentException();
        }
        for (Computer computerListe : head) {
            computerListe.preis = preis;
        }
    }
}
