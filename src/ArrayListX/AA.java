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

        int[] myArray;
        int[] myArray1 = {1,2,3};

        int[][] array1 = new int[2][];
        array1[0] = new int[]{1,2};
        System.out.println(array1[0][0]);

        Object[] objArray = new Object[] {
               // new Car(), //implements MyInterface()
               // new Bus() //extends Vehicle()
                null,
                new java.util.Date(),
                new Integer[8],
                new String("s")
        };
        for (Object obj : objArray) {
            System.out.println(obj);
        }

        String multiStarArr[][] = new String[][] {
                {"A", "b"},
                null,
                {},
                {"A", "b", "C"},
        };
        System.out.println(multiStarArr[3][2]);


        String a = null;
        String b = "a";
        String c = new String("a");
        System.out.println(a==b);

        int[] ccc = new int[3];

        ArrayList<String> arrayList = new ArrayList<>();

        // Hinzufügen von Elementen zur ArrayList
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        // Verwenden der toArray-Methode, um die Elemente in ein String-Array zu konvertieren
        String[] stringArray = arrayList.toArray(new String[0]);

        // Ausgabe des Ergebnisses
        System.out.println("ArrayList: " + arrayList);
        System.out.print("String-Array: ");
        for (String element : stringArray) {
            System.out.print(element + " ");
        }
        System.out.println(b.equals(a));



    }
}
