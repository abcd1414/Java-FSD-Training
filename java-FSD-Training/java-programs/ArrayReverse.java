//Write a program to input a String array and display it, and now to copy the elements into another array in the reverse order and print the reverse_array elements.




import java.util.*;
public class ArrayReverse
{
	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();
		String[] arr1= new String[size];
		String[] arr2= new String[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			arr1[i]=s.next();
		}
		System.out.println("entered array element is ");
		for(int i=0; i<size;i++)
		{
			System.out.println(arr1[i]);
		}
		for(int i=0; i<size;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println();
		System.out.println("reverse order is:");
		for(int i=size-1; i>=0;i--)
		{
			System.out.println(arr2[i]);
		}
	}
}
