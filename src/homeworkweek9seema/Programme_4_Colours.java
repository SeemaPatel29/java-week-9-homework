package homeworkweek9seema;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_Colours {
    public static void main(String[] args) {
        colours();
    }
    //creating static method and calling this method into main method
    public static void colours() {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Pink");
        colours.add("Blue");
        colours.add("Orange");
        colours.add("Magenta");
        colours.add("White");

        // using for each loop
        for(String col : colours ){
            System.out.println(col);
        }



    }

}
