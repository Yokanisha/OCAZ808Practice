package reference;

public class HereThis {
}

class Employee {
    String name;
}

class Programmer extends Employee {

    public static void main(String[] args) {

    //this.name = "dw"; //geht nicht


    }

    void accessEmployeeVariable() {
        this.name = "Programmer";
    }
}