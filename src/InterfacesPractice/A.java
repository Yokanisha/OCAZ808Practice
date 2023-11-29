package InterfacesPractice;

public class A {
    static void methodeA() {
    }

    public static void main(String[] args) {

        methodeA();
    }
}


class B {
    public static void main(String[] args) {
        A a = new A();
        a.methodeA();
        A.methodeA();
    }
}

