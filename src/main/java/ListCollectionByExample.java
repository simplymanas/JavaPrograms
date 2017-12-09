/**
 * Created by Manas Dash on 04/12/17 8:10 AM.
 * 100DaysOFCode
 */

import java.util.*;

public class ListCollectionByExample {
    public static void main(String[] args) {
        List strList = new ArrayList<>();

       //Add to list at the end
        strList.add(0,"X");
        System.out.println(strList);

        //add at an index

        strList.add(1,"D");

        System.out.println(strList);

        //replace

        strList.set(1,"C");
        System.out.println(strList);

        strList.add("Z");
        System.out.println(strList);
        strList.add("B");
        System.out.println(strList);
        strList.add("U");
        System.out.println(strList);
        //remove

        strList.remove("C");
        System.out.println(strList);

        Collections.reverse(strList);
        System.out.println(strList);

        Collections.sort(strList);
        System.out.println(strList);

        Collections.shuffle(strList);
        System.out.println(strList);
        Collections.shuffle(strList);
        System.out.println(strList);


//        Collections.binarySearch(strList);


    }
}
