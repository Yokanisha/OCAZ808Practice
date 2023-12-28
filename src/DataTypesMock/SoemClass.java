package DataTypesMock;

public class SoemClass {
}

class SomeClass{
    String s1 = "green mile";   // 0


    public void generateReport( int n ){
        String local;
        if( n > 0 ) local = "good";   //2
        else local = "bad";

        System.out.println( s1+" = " + local );   //3
    }


    Object getObject(Object a) {

        Object b = new Object();  //XXX

        Object c, d = new Object(); //1
        c = b; //2
        b = a = null; //3
        return c; //4
    }


}



class A{
    public A() { }
    public A(int i) {   System.out.println(i );    }
}
class B{
    static A s1 = new A(1);

    A a = new A(2);
    public static void main(String[] args){
        B b = new B();
        A a = new A(3);
    }
    static A s2 = new A(4);
}




