package KlassenPfad;

public class Pfad {
    int pfad;
    Pfad link;
    Pfad(int pfad) {
         this.pfad = pfad;
         {
            System.out.println(" block konstruktor");
        }
    }

    int myValue = 0;

    static int staticc = staticMethode();

    static {
        System.out.println("static block");
    }
char aaa = 1222;
    public static void main(String[] args) {

        Pfad a = new Pfad(1);
        Pfad b = new Pfad(2);

        a.link = b;

        a.showOne(21);
    }

    static int staticMethode() {
        System.out.println("static methode");
        return 1;
    }

    public void showOne(int myValue){
        myValue = myValue;
    }

    public void showTwo(int myValue){
        this.myValue = myValue;
    }






}


class A { }
class B extends A { }




