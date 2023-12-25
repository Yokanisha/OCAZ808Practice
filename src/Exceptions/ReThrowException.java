package Exceptions;

import java.io.*;

public class ReThrowException {
    FileInputStream soccer;
    public void method() throws FileNotFoundException {
        try {
            soccer = new FileInputStream("soccer.txt");
        } catch (FileNotFoundException fnfe) {
            throw fnfe;
        }

    }

}


class ReThrowException2 {

    public static void main(String[] args) throws IOException {
        ReThrowException2 a = new ReThrowException2();
            a.myMethode2();
    }

    public void myMethode2() throws IOException {
        FileInputStream soccer = new FileInputStream("soccer.txt");
        soccer.close();
    }



}
