package ConstructorsMethodsEncapsulation;


 class DatabaseWrapper {

    static String url = "jdbc://derby://localhost:1527//mydb";
     DatabaseWrapper getDatabase() {
        System.out.println("Getting DB");
        return null;
    }
    public static void main(String[ ] args) {
      //  System.out.println( getDatabase().url );
        DatabaseWrapper a = new DatabaseWrapper();

        System.out.println(a.getDatabase().url);

    }
}




class CorbaComponent{
    String ior;
    CorbaComponent(){
        startUp("IOR");
    }
    void startUp(String s){
        ior  =  s;
    }
    void print(){
        System.out.println(ior);
    }

}

class OrderManager extends CorbaComponent{
    OrderManager(){  }
    void startUp(String s){
        ior = getIORFromURL(s);
    }
    String getIORFromURL(String s){
        return "URL://"+s;
    }
}

 class Application{
    public static void main(String args[]){
        start(new OrderManager());
    }
    static void start(CorbaComponent cc){
        cc.print();
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name =name;
    }
}

class Employee extends Person {

    Employee(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Employee ee = new Employee("Bob");
    }
}