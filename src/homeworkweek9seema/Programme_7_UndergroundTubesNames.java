package homeworkweek9seema;

import java.util.AbstractList;
import java.util.ArrayList;

//7. Write a Java program to test if an array list is empty or not.
public class Programme_7_UndergroundTubesNames {

    public static void isUnderGroundTrainLists(){
        AbstractList<String> underGroundTrains = new ArrayList<String>();
        System.out.println("Orginal array list :" + underGroundTrains);
         if (underGroundTrains.isEmpty()){
             System.out.println("ArrayList is empty ");
         }
         underGroundTrains.add("Jubilee Line");
         underGroundTrains.add("Victoria Line");
         underGroundTrains.add("Bakerloo Line");
         underGroundTrains.add("Metropolitan Line");
         underGroundTrains.add("Central Line");
         underGroundTrains.add("District Line");
         underGroundTrains.add("Elizabeth Line");
        System.out.println("Updated ArrayList :" );

        for(String train : underGroundTrains ){
            System.out.println(train);
        }

       // System.out.println("Updated ArrayList :");
        System.out.println("ArrayList is not  empty");




    }

    public static void main(String[] args) {

        isUnderGroundTrainLists();
    }





}
