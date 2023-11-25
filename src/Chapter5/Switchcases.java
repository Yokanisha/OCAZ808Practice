package Chapter5;

public class Switchcases {

    public static void main(String[] args) {

        int marks = 202;
        switch (marks) {
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            case 30:
                System.out.println(30);
                break;
            default:
                System.out.println("default");
                break;
        }

        String strings = "20";
        switch (strings) {
            case "10":
                System.out.println(10);
                break;
            case "20":
                System.out.println(20);
                break;
            case "30":
                System.out.println(30);
                break;
            default:
                System.out.println("default");
                break;
        }

        String day = "SAT";
        switch (day) {
            case "SAT":
            case "SUN":
                System.out.println("sun or sat");
                //break;
            case "2":
                System.out.println(30);
                break;
            default:
                System.out.println("default");
                break;
        }

        String day1 = new String("SAT");
        switch (day1) {
            case "SAT":
            case "SUN":
                System.out.println("sun or sat");
                //break;
            case "2":
                System.out.println(30);
                break;
            default:
                System.out.println("default");
                break;
        }


        String day2 = new String("SAT");
        switch (day2) {
            default:
                System.out.println("default");
                break;
            case "SAT":
            case "SUN":
                System.out.println("sun or sat");
                //break;

        }

        int marks2 = 202, a = 10, b = 20, c = 30;
        final int d = 9;
        final int e = 11;
        switch (marks2 + a) {
            case 5 + 2: //a+b geht nicht!
                System.out.println(10);
                break;
            case d + e: //das geht wegen final
                System.out.println(20);
                break;
            case 30: //NUR c geht auch nicht
                System.out.println(30);
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("---marks3---");

        int marks3 = 20;
        switch (marks3) {
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
            case 30:
                System.out.println(30);
            default:
                System.out.println("default");
        }






    }


}
