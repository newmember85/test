package PSTA;

public class PcSysteme<T> implements Warenkorb {
    private Object name;

    public PcSysteme(Object name) {
        this.name = name;
    }

    static class Liste<T> {
        T name;
        Liste<T> next;

        Liste(T o, Liste<T> e) {
            name = o;
            next = e;
        }
    }

    private Liste<T> head;

    public void add(T t) {
        if (head == null) {
            head = new Liste<>(t, null);
            return;
        }
        Liste<T> it = head;
        while (it.next != null)
            it = it.next;
        it.next = new Liste<>(t, null);
    }

    @Override
    public void getInhalt() {
        System.out.println(warenString());
    }

    public String warenString() {
        if (head == null) {
            return "Die Liste ist Leer: " + "\n" + "[]";
        }
        Liste it = head;
        StringBuilder output = new StringBuilder(name + "\n" + it.name.toString());
        while (it.next != null) {
            it = it.next;
            output.append("\n").append(it.name.toString());
        }
        return output.toString();
    }


    public void delete(String data) {
        Liste it = head;
        Liste sol = null;

        if (head == null) throw new RuntimeException("Liste ist Leer");

        if (head.name.equals(data)) {
            head = head.next;
            return;
        }

        while (it != null && !it.name.equals(data)) {
            sol = it;
            it = it.next;
        }
        if (it == null) throw new RuntimeException(data + " Exestiert nicht");
        assert sol != null;
        sol.next = it.next;


    }


    public void find(String a) {
        Liste it = head;
        while (it != null) {
            if (it.name.equals(a)) {
                System.out.println("Der Artikel: " + it.name + " wurde gefunden");
                break;
            } else {
                it = it.next;
                System.out.println();
            }
        }
    }

}






