import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class StringNum22 {
    public static void main(String[] args)
    {
    	int sum=0;
    	System.out.println("enter the no string");
    	Scanner sc= new Scanner(System.in);
    	int len =sc.nextInt();
        System.out.println("enter the strings");
        String[] s2=new String[len];
        for(int i=0;i<len;i++)
        {
            s2[i]=sc.next();
    	
        }
        
        int[] arr = new int[s2.length];
        for (int i = 0; i < s2.length; i++) 
        {
            arr[i] = Integer.valueOf(s2[i]);
        }
        System.out.print("String : " + s2);
        System.out.print("\nInteger array :" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
        	{
        		 sum += arr[i];
        	}
        	System.out.println("The sum of all elements is : " + sum);
    }

   
}