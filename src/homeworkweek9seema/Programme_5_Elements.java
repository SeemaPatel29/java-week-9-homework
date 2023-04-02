package homeworkweek9seema;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_Elements {

    public  static void main(String[] args) {
        Programme_5_Elements obj = new Programme_5_Elements();
        obj.arrayList();
    }
    public  void arrayList(){
        ArrayList<String> element = new ArrayList<String>();
        element.add("Helium");
        element.add("Hydrogen");
        element.add("Oxygen");
        element.add("Nitrogen");
        element.add("Carbon");
        element.add("Lithium");
        element.add("Sulfur");

        //using Iteration
        Iterator iterator=element.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
