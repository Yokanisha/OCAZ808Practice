package TestPackage;

 class ParentClass {
    private class PrivateBaseClass {
        public void display() {
            System.out.println("Inside PrivateBaseClass");
        }
    }

    // Subclassing the private class within the same parent class
    private class PrivateSubClass extends PrivateBaseClass {
        public void displaySub() {
            System.out.println("Inside PrivateSubClass");
        }
    }

    public static void main(String[] args) {
        ParentClass parentInstance = new ParentClass();

        // Accessing the private subclass within the same parent class
        PrivateSubClass subInstance = parentInstance.new PrivateSubClass();
        subInstance.display();    // Accessing method from PrivateBaseClass
        subInstance.displaySub(); // Accessing method from PrivateSubClass
    }
}


interface Runnable {}
interface Observer {}

class AAAA implements Runnable{ }
class B extends AAAA implements Observer { }



class dwq {

    public static void main(String[] args) {
        AAAA a = new AAAA() ;
        B b = new B();

        Object o = b;
        Runnable r =  (Runnable) o;

    }
}



