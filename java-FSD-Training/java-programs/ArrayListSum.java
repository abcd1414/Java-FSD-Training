//2 Create a arraylist of integers and find the sum and average of the entire list.

import java.util.Arrays;
import java.util.*;

public class ArrayListSum {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(20);
    list.add(10);
    list.add(5);
    double sum = 0;
    for (int i : list) {
      sum += i;
    }
    double average = sum / list.size();
    System.out.println("sum = " + sum);
    System.out.println("Average = " + average);

  }
}