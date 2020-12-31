package PSTA;

public class Sortieren {
    private static <T> void swap(T[] a, int i, int j) {
        T h = a[i];
        a[i] = a[j];
        a[j] = h;
    }

    //Artikel werden verglichen und sortiert
    public static <T extends Comparable<T>> void priceSort(ArtikelVergleich[] a) {
        for (int n = a.length; n > 1; n--) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0)
                    swap(a, i, i + 1);
            }
        }
        ArtikelVergleich.preisVergleich(a);

    }

}



