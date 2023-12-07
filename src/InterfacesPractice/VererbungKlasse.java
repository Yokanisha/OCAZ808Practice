package InterfacesPractice;

import java.sql.SQLOutput;

public class VererbungKlasse {

    int number = 1111;
    int PLZ = 76234;

    static int code = 1234;
    static int phone = 123456789;


    void methodeA() {
        System.out.println("MethodeA");
    }

    static void methodeB() {
        System.out.println("static - MethodeB");
    }

    void methodeC() {
        System.out.println("MethodeC");
    }


}


class Erben extends VererbungKlasse {

    public static void main(String[] args) {
        System.out.println("Du kannst alles tun, wie es in der Klasse 'Normal' getan wurde.");

    }
}

class ErbenZwei extends VererbungKlasse {

    public static void main(String[] args) {

        ErbenZwei erbenZwei = new ErbenZwei();

        erbenZwei.methodeA();
        erbenZwei.methodeC();


        System.out.println("\n static Methode");
        ErbenZwei.methodeB();
        methodeB();
        VererbungKlasse.methodeB();

    }

    @Override
    void methodeA() {
        System.out.println("MethodeA - ErbenZwei");
    }

    static void methodeB() {
        System.out.println("static - methodeB - aus ErbenZwei");
    }



}
