package I;

public class II {
    public static byte a = 3;

    public static void main(String[] args) {
        methodeA(a);
        methodeB("d"); //char does not work

        StringBuilder aa = new StringBuilder();
        aa.append(12);
        aa.append(false);
        System.out.println(aa);

        StringBuilder bb = new StringBuilder("Hello");
        bb.insert(5,"Next");

        System.out.println(bb);
        int[] multi = new int[3];
        System.out.println(multi[1]);

    }


    public static void methodeA(int number) {
        System.out.println(number);
    }

    public static void methodeB(String string) {
        System.out.println(string);
    }
}
