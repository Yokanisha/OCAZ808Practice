package Chapter5;

public class Comparison {

    public static void main(String[] args) {

        boolean allow = true;
        int number = 0;

        if(allow=false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int score = 150;
        if(score > 100)
            if(score > 200)
                if(score > 300)
                    System.out.println("1");
                else
                    System.out.println("2");
            else
            System.out.println("3");

        System.out.println("-----");

        int score1 = 50;
        if(score1 > 100) {
            if (score1 > 200)
                if (score1 > 300)
                    System.out.println("1");
                else
                    System.out.println("2");
        } else
            System.out.println("3");

        System.out.println("---Ternary construct---");

        int bill = 2001;
        int discount = bill > 2000 ? 15 : 10;
        System.out.println(discount);

        int number1 = 2001;
        int number2 = number1 > 2000 ? number1-150 : number1-100;
        System.out.println(number2);

        int number3 = 2001;
        int number4 = number3 > 2000 ? return11() : return22();
        System.out.println(number4);

        long number5 = 2001;
        int number6 = (int) (number5 > 2000 ?  number5+11 :  number5+22);
        System.out.println(number6);

        int number7 = (5000 > 2000) ? Integer.valueOf(3) : Integer.valueOf(3);
        Integer number8 = (5000 > 2000) ? Integer.valueOf(32) : Integer.valueOf(32);

        int number9 = 2001;
        int number10 = 4000;
        int number11 = number9 > 23000 ? (number10 > 233333) ? 10 : 5 : 2;
        System.out.println(number11);

        int number12 = 2000;
        int number13 = 10;
        int number14 = 10;
        int number15 = number12 > 1000 ? (number13 > 11) ? 10 : (number14 > 9) ? 20 : 30 : 5;
        System.out.println(number15);



    }

    static int return11() {
        return 11;
    }

    static int return22() {
        return 22;
    }

    static void getNothing() {}

}
