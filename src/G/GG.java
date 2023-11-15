package G;

import java.sql.SQLOutput;

public class GG {
    String number;
    int zahl;
    int methodeA(int A) {
        return 1;
    }



//    static int methodeA(int A) {
//        return 1;
//    }

      protected GG (String number) {
        this.number = number;
    }

    public void setNumber(String name) {
        number = name;
    }
    public String getNumber() {
        return this.number;
    }

    public void methodeB(String a, int b){
        System.out.println("methodeB");
    }

    public void methodeC(int... numbers){
        System.out.println("methodeC");
    }

    public void methodeD(int zahl) {
        this.zahl += zahl;
    }

    public static void methodeE(GG name) {
        name.setNumber("dwdw");
    }

    public void methodeF(int number) {
        this.zahl += number;
    }







}
