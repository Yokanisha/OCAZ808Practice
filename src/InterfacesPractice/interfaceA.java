package InterfacesPractice;

//interfaceA exntends interfaceB -> interfaceB muss keine methoden von super-interfaceA deklarieren!
//Access modifier bei inetrface -> public oder keine
public interface interfaceA {
    public void methodeA(); //no need to take

    public abstract void methodeB(); //abstract ist nicht ist überflüssig

    public default void methodeC() { //muss NICHT übernommen werden
        System.out.println("methodeC");
    }

    public default void methodeF() { //muss NICHT übernommen werden
        System.out.println("methodeF - aus interfaceA");
    }

    public default void methodeD() { //muss NICHT übernommen werden
        System.out.println("methodeD");
    }
    interface interface2 {} //muss NICHT übernommen werden. Man kann auch kein "sout" hinschreiben

    static void methodeE() {
        System.out.println("methodeE - static methode - muss einen body haben. Er muss aber nicht 'geerbt' werden");
    }

    String name = "MyName";
    static int age = 1; //access modifiers wie public sind überflüssig

    String plz = "von interfaceA";

}



interface interfaceB extends interfaceA {

//     Geht nicht weil MethodeD schon in interfaceA deklariert wurde. return typ zu ändern bringt nichts.
//    default void methodeD() {
//        System.out.println("dw");
//    }

    //Sowas geht, obwohl die Methode in interfaceA deklariert wurde
    public void methodeD();

    String plz = "von interfaceB";


//    public default void methodeF() { //das geht auch aber dann nimmt er die methodeF aus interfaceA nicht mehr
//        System.out.println("methodeF - aus interfaceB");
//    }

}


//Man könnte auch interfaceA implementieren, aber wäre unnötig
class classA implements interfaceB{

    public static void main(String[] args) {
        classA myClassA = new classA();

        myClassA.methodeA();
        interfaceA.methodeE(); //Bei static methoden so holen. ansonsten geht es nicht. per interfaceB geht es nicht.
        myClassA.methodeF(); //aus default methode

        System.out.println(plz);




    }

    @Override
    public void methodeA() {
        System.out.println("aus classA - methodeA");

    }

    @Override
    public void methodeB() {

    }

    //Es ist aus einer default Methode. Mann muss es nicht Override aber man kann.
    @Override
    public void methodeC() {

    }

//Beachte das das keine default methode ist.
    @Override
    public void methodeD() {

    }


}



