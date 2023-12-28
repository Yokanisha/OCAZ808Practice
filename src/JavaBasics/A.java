package JavaBasics;

import java.util.ArrayList;

public class A{


    public static void main(String[] args){
        System.out.println(new A().main);
         System.out.println(new A().number);
        System.out.println(new A().zahl);
      //  System.out.println(new A().b);
    }
    int main;
    int number = 3;
    static int zahl;
}


class c {

    public static void main(String[] args) {

        System.out.println(Boolean.valueOf(true));
        System.out.println(Boolean.parseBoolean("true"));

        byte starting = 3;
        short firstValue = 5;
        int secondValue = 7;

        int functionValue =
                starting / 2 + firstValue / 2 + firstValue / 3 + secondValue / 2;
        System.out.println(functionValue);



        System.out.println(Boolean.valueOf(true) == Boolean.valueOf(true));

        Boolean a = new Boolean(true);
        Boolean b = new Boolean(true);

        System.out.println(a==b);

    }


    void get(String a) {}

    void get(Boolean a) {}
}



class Super{
    static{ System.out.print("super "); }

}
class One{
    static {  System.out.print("one "); }
}
class Two extends Super{
    static {  System.out.print("two "); }
}
 class Test{

    static int si = 10;
    int  i;
     static boolean bool;

     String s = this.toString();
     static char ch;

    public static void main(String[] args){
        One o = null;
        Two t = new Two();

        float d = 1.5F;
        System.out.println(d);

        Float dd = (float) 1;

        Long a = 12L;

        System.out.println(bool);
        System.out.println(new Boolean(true));

        Test test = new Test();
        System.out.println(test.s);
        System.out.println(ch);

        byte b = (byte) 320;
        System.out.println(320%(2*2*2*2*2*2*2*2));


        int i = 0;
        int j = 2;
        if( (i++ == 0) & (j++ == 2) ){
            i = 12;
        }
        System.out.println(i+" "+j);

        System.out.println((int) 5.5f);

        float f = 5.5f;
        double ddd = 3.8;
        System.out.println(((int) (f + ddd)) == ((int) f + (int) ddd));
        Short condition = new Short("1");
    }
}


 class Testfew{
    public static void main(String[] args){
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away "+ args[1]);
    }
}