package H;

public class GarbageCollectionExample {



    public static void main(String[] args) {

//        MyClass obj = new MyClass("Beispiel");
//
//        MyClass reference = obj;
//
//        obj = null;
//
//        System.out.println(reference.data);
//
//        reference.methodeA();



//        MyClass hello = new MyClass("Naja");
//        hello.zahl = 88;
//        hello.methodeC(hello);
//        System.out.println(hello.zahl);

        MyClass hello = new MyClass("Naja");
        char c = 10;
        hello.MethodeE(c);

        String str1 = new String("Test");
        String str2 = "Test";
        String str3 = "Test";

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);

        String str4 = new String("Morning");
        System.out.println("Morning" == str4);
        char[] c1 = new char[]{'1', '2'};
        String str5 = new String(c1);

        String str6 = new String(new char[]{'1', '2'});

        final String str7 = "hii";

        String str8 = "Merhaba";
        String str9 = str8.substring(2,7);
        System.out.println(str9);






    }
}

class MyClass {
    String data;
    int zahl = 2;
    char charr;
    public MyClass(String data) {
        this.data = data;
    }


    public void methodeA() {
        {
            System.out.println("A");
        }
        System.out.println("x");
        {
            System.out.println("B");
        }
    }

    public void methodeB(int a) {
        zahl += a;
    }

    public void methodeB(MyClass p) {
        p.zahl = 999;
        System.out.println(p.zahl);
    }

    public void methodeC(MyClass p) {
        p = new MyClass("dwdw");
        p.zahl = 999;
        System.out.println(p.zahl);
    }

    public void MethodeD(int a, String b) {}

    public double MethodeD(int a) {
        return 1;
    }

    public void MethodeE(int s) {
        System.out.println(s);
    }

    public void MethodeE(long s) {
        System.out.println(s);
    }




}

 class IncrementExample {
    public static void main(String[] args) {
        int a = 1;


        int result1 = ++a;  // Zuerst wird a um 1 erhöht, dann wird der Wert in result1 verwendet
        System.out.println("Prä-Inkrement: a = " + a + ", result1 = " + result1);

        a = 1;  // Zurücksetzen von a auf 1


        int result2 = a++;  // Zuerst wird der aktuelle Wert von a in result2 verwendet, dann wird a um 1 erhöht
        System.out.println("Post-Inkrement: a = " + a + ", result2 = " + result2);
        System.out.println(result2);
        System.out.println(result2);
        int b = result2;
        System.out.println(b);

        for(int i = 0; i<5; ++i) {
            System.out.println(i);
        }
    }
}

