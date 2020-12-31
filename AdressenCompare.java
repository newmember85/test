package PSTA;

import java.util.*;

public class AdressenCompare {

    private List<String> länder = new LinkedList<>();
    public static List<String> länder2 = new LinkedList<>();

    public AdressenCompare(Iterator<String> länderIterator) {
        while (länderIterator.hasNext())
            länder.add(länderIterator.next());

    }

    //Wie viele Länder können beliefert werden
    public int countLänder() {
        return länder.size();
    }

    //Länder sortieren
    public List<String> länderDiffer() {
        Set<String> uniq = new HashSet<>();
        for (String s : länder) {
            uniq.add(s.split(" ")[0]);


        }

        List<String> list = new LinkedList<>(uniq);
        list.sort(Comparator.naturalOrder());
        länder2.addAll(länder);
        return list;
    }

}
