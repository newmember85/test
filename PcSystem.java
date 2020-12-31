package PSTA;

interface PcSystem<T> {


    boolean addElement(Computer neuerPC);

    String getName();

    int getSSD();

    void getData();

    int getPreis();

    void setMainboardName(String name);

    void setMainboardRam(int ram);

    void setMainboardGrafik(String grafik);

    void setMainboardUsbPorts(int usbPorts);

    void setMainboardCPU(String cpu);

    void setNameComputer(String name);

    void setCpuKühler(String cpuKühler);

    String getCpuKühler();

    void setSsd(int ssd);

    void setPreis(int preis);
}







