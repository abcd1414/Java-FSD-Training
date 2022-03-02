package com.ust;

public class Question4 {
	public static void main(String[] args) 
	 {
	  int count=0;
	  int sum=0;
	  loop1:
	   for(int i=1;i<50;i++)
	   {
	    if(i%2!=0)
	    {
	     continue;
	    }
	    else if(i%2==0)
	    {
	     sum+=i;
	     count++;
	     if(count==10)
	     {
	      break loop1;
	     }
	    }
	   }
	  System.out.println("The sum of 10 even numbers is " +sum);
	 }


}
