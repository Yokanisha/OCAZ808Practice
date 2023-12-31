package InterfacesPractice;

public class TwoInterfaces {
}

interface InterfaceC {
    String name = "MyName";
    static int age = 1; //access modifiers wie public sind überflüssig

    static int code = 123;

    String plz = "von interfaceA";

    String numberC = "number from interfaceC";


    void methodeA();

    void methodeB();

    default void methodeC() {
        System.out.println("methodec - InterfaceC");
    }

    static void methodeD() {
        System.out.println("static methodeD - interfaveC");
    }



}

interface InterfaceD {
    String name = "MyName";
    static int age = 1; //access modifiers wie public sind überflüssig

    String plz = "von interfaceA";

    String numberD = "number from interfaceD";

    void methodeA();
    //int methodeB(); //InterfaceC hat die selbe methodennamen, also muss auch der Rückgabetyp der gleiche sein. Sonst kann die klasse beide nicht implementieren.

    default void methodeC() { //Merke! rückgabeTyp muss mit InterfaceC übereinstimmen!
        System.out.println("methodec - InterfaceD");
    }

    static String methodeD() { //Merke! Bei static kann rückgabewert gleich mit interfaceC sein.okö
        return "static methodeD - interfaveD";
    }

    default void methodeE() { //Merke! rückgabeTyp muss mit InterfaceC übereinstimmen!
        System.out.println("methodec - InterfaceD");
    }

    static void methodeG() { //Merke! Bei static kann rückgabewert gleich mit interfaceC sein.okö
        System.out.println("xxx");
    }




}

class ClassB implements InterfaceC, InterfaceD {

    public static void main(String[] args) {

        //System.out.println(plz); //geht nicht, weil beide interface selbe name+typ haben
        System.out.println(InterfaceC.plz); //so geht das
        System.out.println(numberD); // so geht es auch

        ClassB classB = new ClassB();
        classB.methodeC();
        classB.methodeE();

        System.out.println(InterfaceD.age);
        System.out.println(ClassB.code);
        System.out.println(InterfaceC.code);
        System.out.println(code);

        InterfaceC.methodeD(); //static





    }

    

    static void aa(){
        System.out.println("aa");
    }


    @Override
    public void methodeA() {

    }

    @Override
    public void methodeB() {

    }

    @Override
    public void methodeC() {

        InterfaceC.super.methodeC();
        System.out.println("own input fromd efault methode in ClassA");
    }



}