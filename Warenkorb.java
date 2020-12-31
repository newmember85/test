package PSTA;

interface Warenkorb<E> {

    void getInhalt();

    String warenString();

    <E> void delete(String data);

    void find(String a);
}
