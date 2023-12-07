package PolymorphismPacket;

public class Poly1 {
    String name = "poly1";
    int number = 1;

    void methodePoly() {
        System.out.println(name);
    }

    void methodePolyAlone1() {
        System.out.println("methodePolyAlone1");
    }

}

class Poly2  extends Poly1{

    String name = "poly2";
    int number = 2;

    void methodePoly() {
        System.out.println(name);
    }

    void methodePolyAlone2() {
        System.out.println("methodePolyAlone2");
    }

}

class Main {
    public static void main(String[] args) {
        Poly1 poly = new Poly2();

        System.out.println(poly.name);
        System.out.println(poly.number);
        poly.methodePoly();
        poly.methodePolyAlone1();
    }
}
