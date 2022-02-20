import java.io.*;
import java.util.*;
public class AsciCode
 {
    public static void main(String[] args)
    {
   
    	Scanner s= new Scanner(System.in);
    	System.out.println("enter the no of character");
    	int num=s.nextInt();
    
    	char[] a=new char[num];
    	System.out.println("enter the character");
    
    	for(int i=0;i<num;i++)
    	{
    		a[i]=s.next().charAt(0);
    	}
    	System.out.println("ASCII value of character is ");
    	for(int i=0;i<num;i++)
    	{
    		int ascii= a[i];
    		System.out.println(ascii+",");
    	}
    }
}
