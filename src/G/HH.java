package G;

public class HH {
    static int[] arr = {1,2,3,4};
    public static void main(String[] args) {
        GG a = new GG(null);

        System.out.println(a.getNumber());
        new GG("dfw");

        a.methodeB("dw",0);
        a.methodeC(arr);

        System.out.println(a.zahl);
        a.methodeD(1);
        System.out.println(a.zahl);
    }

    public static void methodeE(GG name) {
        name.setNumber("dwdw");
    }

    public static void methodeF(String name) {
        GG a = new GG("dw");
        a.setNumber(name);
    }
}
