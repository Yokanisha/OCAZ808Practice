package ConstructorsMethodsEncapsulation;

public class ExceptionsExample {
}

class XXX{
    public void m() throws Exception {
      //  throw new RuntimeException();
    }


}
class YYY extends XXX{
    public void m() throws Exception {
            throw new Exception();
    }

}

class ZZZ extends YYY {
    public void m() {
        throw new RuntimeException();
    }

}

class TestClass {
    public static void main(String[] args) throws Exception {
        XXX obj = new XXX();
        obj.m();
    }
}
