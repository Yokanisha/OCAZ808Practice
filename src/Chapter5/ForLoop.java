package Chapter5;

public class ForLoop {

    public static void main(String[] args) {
        int tableOf= 5;
        for(int i=1; i <= tableOf ; ++i) {
            System.out.println(i);
        }

        for(int i=1; i <= tableOf ; ++i, getHappy()) {
            System.out.println(i);
        }

        int number = 1;
        for(; number <= tableOf ; ++number, getHappy()) { //condition, und update kann auch weg
            System.out.println(number);
        }

        // es funktioniert aber infinitiv
//        for(;;) {
//            System.out.println(1);
//        }

        System.out.println("---array---");
        int muliArray[][] = new int[2][3];
        for(int i=0; i < muliArray.length; i++) {
            for(int j=0; j < muliArray[i].length; j++) {
                muliArray[i][j] = i+j;
                System.out.println(muliArray[i][j]);
            }


        }



    }

    static void getHappy() {
        System.out.println("Happy");
    }
}
