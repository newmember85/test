package PSTA;


class startup {
    public static void main(String[] args) {
        Mainboard mainboardAMD = new Mainboard("ROG Strix B450-F", 16, "NVIDIA GeForce RTX 2060 Super", 3, "AMD Ryzen 5 3600X");
        Mainboard mainboardIntel = new Mainboard("ASUS ROG Strix X299-E", 64, "NVIDIA GeForce RTX 2080 Super", 4, "Intel Core i9-10900X");
        Mainboard mainboardApple = new Mainboard("Apple", 32, "Radeon Pro 580X", 2, "Intel Xeon W");

        OfficeComputer office = new OfficeComputer();
        office.addElement(Computer.erstelleOffice(mainboardAMD, "Corsair H100i RGB Pro XT ", 500, "1000W", "Office", 9899));
        PrivaterComputer privat = new PrivaterComputer();
        privat.addElement(Computer.erstellePrivat(mainboardApple, "Apple", 256, "Apple", "Mac Pro", 6499));

        PrivaterComputer test = new PrivaterComputer();
        test.addElement(Computer.erstellePrivat(mainboardApple, "Apple", 256, "Apple", "Mac ", 6499));
        PrivaterComputer ad = new PrivaterComputer();


        //only one Private use
        WarenkorbList<String> einkauf = new WarenkorbList<>();
        einkauf.add(privat.getName(), privat.getPreis(), "Private");
        einkauf.rabattCode("OOP");
        //einkauf.delete("Mac Pro");
        einkauf.getInhalt();


        Laptop razer = new Laptop();
        razer.addElement((Computer.erstelleOffice(mainboardAMD, "Corsair H100i RGB Pro XT ", 500, "1000W", "Razer Laptop", 9899)));
        razer.getData();


        PcSysteme<String> grafikArt = new PcSysteme<>("GrafikKarten-Liste: ");
        grafikArt.add(mainboardAMD.grafik);
        grafikArt.add("Apple");

        grafikArt.getInhalt();
        grafikArt.find("Apple");
        
        System.out.println("hallo Welt hahah");
        System.out.println("hallo welt du lappen wie geht es dir");
        


    }
}

