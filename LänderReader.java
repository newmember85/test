package PSTA;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class LänderReader {

    public static Iterator<String> länderReader() throws IOException {
        BufferedReader rd = Files.newBufferedReader(Paths.get("PSTA/Adressenverwaltung.txt"));

        return new Iterator<>() {
            String next = rd.readLine();

            public boolean hasNext() {
                return next != null;
            }

            public String next() {
                String f = next;
                try {
                    next = rd.readLine();
                    if (next == null)
                        rd.close();
                } catch (IOException e) {
                    next = null;
                }
                return f;
            }
        };
    }
}
