package Exceptions;

public class ThrowArithmeticEx {
    public static void main(String[] args) {
    int a = 10;
    int y = a++;
    int z = y--;

    System.out.println("a: " + a + ", y: " + y + ", z: " + z);

    int x1 = a - 2*y - z;
    int x2 = a - 11;

        System.out.println("x1: " + x1);

    //int x = x1 / x2;

        System.out.println((int) 7.3 / 10.6);
        System.out.println( 7.3 / 10.6);
        System.out.println((int) 100.76 / 123.87);
        System.out.println(100.76 / 123.87);

        int x3 = (int) (7.3 / 10.6);
        int x4 = (int) (100.76 / 123.87);
        double x5 = (100.76 / 123.87);
        double x6 = (100.76 / 123.87);


        System.out.println("x3: " + x3 + ", x4: " + x4 + ", x5: " + x5 + ", x6: " + x6);

        //int x5 = x3/x4;

        int x7 = (int) (1.8 / 3);
        int x8 = (int) (1.2 / 3);
        int x9 = (int) (1.5 / 3);

        System.out.println("x7: " + x7 + ", x8: " + x8 + ", x9: " + x9);

        int x10 = (int) (3.6 / 3);
        int x11 = (int) (6.6 / 3);
        int x12 = (int) (9.6 / 3);

        System.out.println("x10: " + x10 + ", x11: " + x11 + ", x12: " + x12);

        double x13 = 1/0.0;
        System.out.println(x13);

        System.out.println(Integer.parseInt("1011010101", 2));

    }
}
