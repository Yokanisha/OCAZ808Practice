package Inheritans;

//Access modifier: public or no modifier

public class Inherit {
}


class Employee {
    String name;
    int age = 18;

    public void getAge() {
        System.out.println(age);
    }

}


class Programmer extends Employee {
    Programmer(String val) {
        name = val;
    }

    String getName() {
        System.out.println(name);
        return name;
    }

    public void getAge() {
        System.out.println("Age auf Programmer");
    }

}


class Office {
    public static void main(String[] args) {
        new Programmer("Harry").getName();

        Programmer programmer1 = new Programmer("programmer1");
        System.out.println(programmer1.name);

        programmer1.getAge();



    }


}








