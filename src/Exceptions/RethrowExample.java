package Exceptions;

public class RethrowExample {

    public static void main(String[] args) {
        try {
            performOperation();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void performOperation() {
        try {
            // Hier könnte eine RuntimeException ausgelöst werden
            throw new RuntimeException("Eine Beispiel-RuntimeException");
        } catch (RuntimeException e) {
            System.out.println("1: " + e);
            throw e;
        }
    }
}

