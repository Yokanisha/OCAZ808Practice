package PolymorphismPacket;

interface PolyInter1 {
    String name = "Interface";
     void polyInter1();
}

public class PolyInterface1 implements PolyInter1 {
    @Override
    public void polyInter1() {
        System.out.println("PolyInterface1");
    }
}


class Employee  extends PolyInterface1 {

    public static void main(String[] args) {
        PolyInterface1 emp = new Employee();

        emp.polyInter1();

        Employee emp1 = new Employee();
        emp1.polyInter1();

        
    }




}
