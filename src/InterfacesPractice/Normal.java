package InterfacesPractice;

//Eine Klasse

public class Normal {

    int number = 1111;

    static int code = 1234;

    public static void main(String[] args) {

       Normal normal = new Normal();

        System.out.println("---instance variable---");
        System.out.println(normal.number);

        System.out.println("\n---static variable---");
        System.out.println(code);
        System.out.println(Normal.code);


        System.out.println("\n---instance methode---");
        normal.methodeA();

        System.out.println("\n---static Methode---");
        methodeB();
        Normal.methodeB();


    }

    void methodeA() {
        System.out.println("MethodeA");
    }

    static void methodeB() {
        System.out.println("static - MethodeB");
    }
}
