package H;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before calling modifyPerson: " + person.name);

        // Calling a method that modifies the object's field
        modifyPerson(person);

        System.out.println("After calling modifyPerson: " + person.name);

        // Calling a method that assigns a new object reference
        assignNewPerson(person);

        System.out.println("After calling assignNewPerson: " + person.name);
    }

    static void modifyPerson(Person p) {
        p.name = "Bob";
    }

    static void assignNewPerson(Person p) {
        p.name = "dfd";
       p = new Person("Charlie");
    }
}