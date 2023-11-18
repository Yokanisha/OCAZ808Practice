package ArrayListX;

import java.util.ArrayList;
import java.util.ListIterator;

public class AA {

    public static void main(String[] args) {
        ArrayList<String> myArr = new ArrayList<>();
        myArr.add("AA");
        myArr.add("BB");
        myArr.add("CC");

        ListIterator<String> iterator = myArr.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().equals("AA")) {
                iterator.remove();
            }
        }

        for(String a : myArr){
            System.out.println(a);
        }

        int[][] array1 = new int[2][];
        array1[0] = new int[]{1,2};
        System.out.println(array1[0][0]);



    }
}
