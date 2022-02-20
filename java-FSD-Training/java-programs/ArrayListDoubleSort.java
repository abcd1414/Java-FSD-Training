//Write a program to create a arraylist of double element and add the elements sort the elements in descending order print


import java.util.*;
  
public class ArrayListDoubleSort {
    public static void main(String args[])
    {
    	ArrayList<Double> list = new ArrayList<Double>();
  
        list.add(20.5);
        list.add(5.16);
        list.add(10.6);
        System.out.println("Unsorted ArrayList: "+ list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList in Descending order : "+ list);
        double sum = 0;
         for (double i : list) {
         	sum += i;
         }
         
         System.out.println("sum = " + sum);


    }
}