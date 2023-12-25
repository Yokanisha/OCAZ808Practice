package Exceptions;

public class FallInRiverException extends RuntimeException{
}

class RiverRafting {
    void crossRapid(int degree) throws FallInRiverException {
        System.out.println("Cross Rapid");
        if (degree > 10) throw new FallInRiverException();
        }
    }


class TestRiverRafting {
    public static void main(String[] args) {
        RiverRafting riverRafting = new RiverRafting();
        try {
            riverRafting.crossRapid(11);
        } catch (FallInRiverException e) {

            System.out.println(e);
        }
    }


}
