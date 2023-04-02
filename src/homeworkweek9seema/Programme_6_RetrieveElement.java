package homeworkweek9seema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElement {
    public static void main(String[] args) {
        Programme_6_RetrieveElement obj = new Programme_6_RetrieveElement();
        obj.spcifiedIndex();
    }

    public void spcifiedIndex(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Yellow");
        list.add("Purple");
        list.add("Orange");

        System.out.println(list);
        System.out.println("Please enter index :");
        // scanner declaration
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a< 0 || a > 5 ){
            System.out.println("Nothing to return at index " + a);

        }else {
            String element = list.get(a);
            System.out.println("Element at index " + a + " is : " + element);
        }
        scanner.close();



    }

}
