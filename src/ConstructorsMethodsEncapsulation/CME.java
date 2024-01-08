package ConstructorsMethodsEncapsulation;

public class CME {
    static String s1 = sM1("a");

    String s3 = sM1("2");

    {
         s1 = sM1("3");
    }


    static {
         s1 = sM1("b");
    }

    public static void main(String[] args) {
       System.out.println(CME.s1);

       // CME a = new CME();
    }

    private static String sM1(String s){
        System.out.println(s);
        return s;
    }

    void soutCME() {
        System.out.println("SME");
    }


}

class Junior extends CME {


    public static void main(String[] args) {
        CME a = new Junior();

        a.soutCME();
    }
    void soutCME() {
        System.out.println("JUNIOR");
    }

}
