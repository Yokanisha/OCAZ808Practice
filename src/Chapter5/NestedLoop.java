package Chapter5;

import java.util.ArrayList;

public class NestedLoop {

    public static void main(String[] args) {

        ArrayList<String> exam = new ArrayList<>();
        exam.add("Java");
        exam.add("oracle");

        ArrayList<String> levels = new ArrayList<>();
        levels.add("BAsic");
        levels.add("Advance");

        ArrayList<String> grades = new ArrayList<>();
        grades.add("Pass");
        grades.add("Fail");

        ArrayList<ArrayList<String>> nestedArrayList = new ArrayList<>();

        nestedArrayList.add(exam);
        nestedArrayList.add(levels);
        nestedArrayList.add(grades);


        for(ArrayList<String> nested: nestedArrayList) {
            for(String element : nested) {
                System.out.println(element);
            }
        }

        System.out.println("--- StringBuilder---");

        StringBuilder myString = new StringBuilder("Java");
        myString.append(1);
        System.out.println(myString);




    }
}
