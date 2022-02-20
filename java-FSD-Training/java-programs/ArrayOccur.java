//Write a program to input an array of integers according to the user , and also take a input of a particular integer and find out the occurence of the intger in the array


import java.util.*;
public class ArrayOccur
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();
		int[] arr1= new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("entered array element is ");
		int x=s.nextInt();
		for(int i=0; i<size;i++)
		{
			if(x==arr1[i])
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("no of occurence: " +count);
	}
}