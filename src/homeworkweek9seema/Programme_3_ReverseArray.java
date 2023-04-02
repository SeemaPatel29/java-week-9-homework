package homeworkweek9seema;

import java.util.*;

//3. Write a Java program to reverse an array of integer values.
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        Integer[] userarray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Programme_3_ReverseArray.getReversedArray( userarray);
    }
        public static void getReversedArray(Integer[] userarray){

       Integer [] inputarray= userarray;
            System.out.println("Before Reverse ");
            System.out.println(Arrays.toString(inputarray));

            // convert from array to List
            List<Integer> list = Arrays.asList(inputarray);

            //list is Reversed
            Collections.reverse(list);
            //convert from list to array
            Integer[] a =(Integer[]) list.toArray();

            System.out.println(" After Reverse ");
            System.out.println(Arrays.toString(a));



         }

    }

