package com.ust;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args)
	{
		System.out.println("Enter the Number of elements :");
		Scanner sc =new Scanner(System.in);
	    int num;
	    num=sc.nextInt();
	    int[] a= new int[num];
	    System.out.println("Enter the elements :");
	    for (int i = 0; i < num; i++)  
	    	{  
	        	a[i]=sc.nextInt();
	        }
	    int sum=0;
	    for (int i = 0; i < num; i++)  
	    {  
	        if(a[i] >=0)
	        sum=sum+a[i];
	    }
	    System.out.println("The sum of positive numbers are " +sum);
	    }

}
