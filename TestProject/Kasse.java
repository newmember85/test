package PSTA;

abstract class Kasse {
    //Rabatt auf Mengen Computer //OFfICE BENUTZUNG
    int officeApply(int count, int preis) {
        int sum = 0;
        if (count > 4) {
            int percentRab = 1000;
            sum = (preis - (count * percentRab));
        }
        return sum;
    }


}
