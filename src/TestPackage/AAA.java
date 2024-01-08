package TestPackage;

public class AAA {
}

class Super {
    static String ID = "ID";
    static { System.out.println("In SUPER"); }
     { System.out.println("In SUPER BLOCK"); }

}

class Sub extends Super{
    static { System.out.println("In Sub"); }
     { System.out.println("In Sub BLOCK"); }

    static String EE = "<EE>";
}
 class Test{
    public static void main(String[] args){
        //System.out.println(Sub.EE);
        //Sub a = new Sub();
       // Super aa = new Super();
        //Super aaa = new Sub();
    }
}









class A {
    public int getCode(){ return 2;}
}

class AA extends A {
    public int getCode(){ return 3;}
}

 class TestClass {

    public static void main(String[] args) throws Exception {
        A a = new A();
        A aa = new AA();
        AA aaa = new AA();
        System.out.println(a.getCode() + " " + aaa.getCode());
    }

    public int getCode() {
        return 1;
    }
}






