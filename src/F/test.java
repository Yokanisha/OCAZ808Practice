package F;

 class test {
     String phoneNumber = "21312";
     String name;
     public test(String name) {
         this.name = name;
         System.out.println("hi");
     }
     void setNumber() {
         String phoneNumber;
         phoneNumber = "09070";
         System.out.println("methodeA");

     }

     public void setName(String newName) {
         this.name = newName;
     }

     public String getName() {
         return this.name;
     }


}

class TestPhone {
    public static void main(String[] args) {
        test a = new test("hallo");
        a.setName("nihao");
        a = null;
        a = new test("neww");
        System.out.println(a.getName());




    }
}
