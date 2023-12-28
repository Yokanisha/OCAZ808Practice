package JavaBasics;

public class Test123{
    public static void main(String[] args){
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);

}

    static int mx(int s){
        for(int i=0; i<3; i++){
            s = s + i;
            System.out.println(i);
        }
        return s;
    }


}

 class TestClass {
     public static void main(String[] args) throws Exception {

         System.out.println(args.length);

         }


     }




