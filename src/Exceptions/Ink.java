package Exceptions;

public class Ink {
}

interface Printable {}
class ColorInk extends Ink implements Printable {}

class BlackInk extends Ink{}

class twistInTalecasting {
    public static void main(String[] args) {

        Printable printable = null;
        BlackInk blackInk = new BlackInk();
        ColorInk colorInk = new ColorInk();
        //printable = (Printable) blackInk; ClassCastException

        //System.out.println(printable = (Printable) blackInk);
    }
}
