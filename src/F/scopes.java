package F;

public class scopes {

    static int a = 2;


    int b = 3;
    int x = b;
    static int  c = 3;

    public static void methodeA() {
        int b = 0;
        a += b;
        System.out.println(a);
    }

    public static void main(String[] args) {
        methodeA();

        scopes a = new scopes();
        methodeA();
        a.methodeA();

        scopes.methodeA();
    }

    boolean isPrime(int num) {
        boolean result = true;

        if(num <= 1)
            return false;

        for(int ctr = num-1; ctr > 1; ctr--) {
            if(num%ctr == 0)
                result = false;
        }
        return result;
    }
}
