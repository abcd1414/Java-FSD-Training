//Write a program to input an array of integers according to the users, and find the greatest value of them.



import java.util.*;
public class Largestarray1
{
	public static void main(String[] args)
	{
		int max;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();
		int[] arr1= new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("entered array elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr1[i]);
		}
		max=arr1[0];
		for(int j=0;j<size;j++)
		{
			if(max < arr1[j])
			{
				max = arr1[j];
			}
			System.out.println("maximum value in the array:" +max);
			
		}
		
    }
}
	

		
		

