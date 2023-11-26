package Chapter5;

import java.util.ArrayList;

public class WhileLoops {

    public static void main(String[] args) {

        int num=10;

        do {
            num++;
        } while(++num>20);

        System.out.println(num);



        System.out.println("---outer---");
        String[] programmers = {"Outer", "Inner"};
        outer:
        {
                int[] example = {1,2};
            for (String outer : programmers) {
                for (String inner : programmers) {
                    if (inner.equals("Inner"))
                        break outer;
                    System.out.println(inner + ":");
                }
            }
        }

        System.out.println("---outer1---");
        String[] programmers1 = {"Outer", "Inner"};
        outer:
            for (String outer : programmers1) {
                for (String inner : programmers1) {
                    if (inner.equals("Inner"))
                        break outer;    //auch mit continue statement
                    System.out.println(inner + ":");
                }
            }

        System.out.println("----");





    }
}
