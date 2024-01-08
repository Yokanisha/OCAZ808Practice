package ConstructorsMethodsEncapsulation;

public class Wrapper{
    int w = 10;
}

class TestClassx{

    static Wrapper changeWrapper(Wrapper w){
        w = new Wrapper();
        w.w += 9;
        return w;
    }

    void probe(Object x) { System.out.println("In Long"); } //4

    static public double getLoad(){
        return 3;
    }


    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        w.w += 30;
        System.out.println(w.w);
        w = changeWrapper(w);
        System.out.println(w.w);

        String a = "hello";
        new TestClassx().probe(3);

        System.out.println(getLoad());
    }
}
