package InterfacesPractice;

public class Example1 {
}

interface Ronaldo {

    default void Methode1() {
        System.out.println(1);
    }
}

interface Messi {

    default void Methode1() {
        System.out.println(2);
    }
}

interface Christiano extends Ronaldo, Messi {


    default void Methode1() {
        System.out.println(3);
    }

}

class Chicka implements Ronaldo, Messi, Christiano {
    public static void main(String[] args) {
        new Chicka().Methode1();

        int number = (3 < 2) ? 23 : (2 < 44) ? 12 : 2;
    }
}
