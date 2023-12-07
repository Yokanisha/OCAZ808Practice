package InterfacesPractice;

public class InterfaceClass {
}

interface InterfaceE {

    static int number = 0;
    int code = 1;

    void methodeA();

    default void methodeB() {
        System.out.println("defualt - methodeB - InterfaceA");
    }

    static void methodeC() {
        System.out.println("static - methodeC - InterfaceA");
    }

}

class ClassC implements InterfaceE {

    public static void main(String[] args) {
        ClassC classC = new ClassC();

        System.out.println("---Methode---");

        classC.methodeA();
        classC.methodeB();


        InterfaceE.methodeC();


    }

    @Override
    public void methodeA() {
        System.out.println("MethodeA - ClassA");
    }

    @Override
    public void methodeB() {
        System.out.println("MethodeB - ClassA");
    }


}
