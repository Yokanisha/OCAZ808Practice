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
    protected int i;
    A(int i) {    this.i = i;    }
    A() {        }

}

class B extends A {
    B()  {
        System.out.println("i = " + i);
    }

}


