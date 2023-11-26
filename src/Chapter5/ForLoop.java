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


        System.out.println("--initalize array with for-loop---");
        int[] myArray = new int[5];
        for(int i=0; i< myArray.length; ++i) {
            myArray[i] = i;
            if((myArray[i]%2)==0) {
                myArray[i] = 20;
            }
        }

        //You cant modify, delete, initialize in a for-each-loop
        System.out.println("--modify array with for-each-loop---");
        for(int i : myArray) {
            int count = 0;
            if(i == 20) {
                myArray[count] = 111;
            }
            count++;
            System.out.println(i);
        }



    }

    static void getHappy() {
        System.out.println("Happy");
    }
}
