

import java.util.Scanner;
public class SortArrBubbleAsc {
	
	
	void bubbleSort(int arr3[])
	{
		int n=arr3.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++)
			{
				if(arr3[j+1]<arr3[j])
				{
					//swap arr3[j+1] and arr3[j]
					int temp=arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=temp;
				}
				
			}
		
		
	}
	
   //print array
	void printArray(int arr3[])
	{
		int n=arr3.length;
		for(int i=0;i<n;++i)
		System.out.print(arr3[i] + " ");
		System.out.println();
	}

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of integer array");
		int size=sc.nextInt();
		
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		int[] arr3=new int[size];
		
		
		
		System.out.println("enter elements of 1st array");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		
		System.out.println("enter elements of 2nd array");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("common elements array ");
		
		for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                	arr3[i]=arr1[i];
                	System.out.print(arr3[i]+" ");
                }
             }
         }
         SortArrBubbleAsc ob=new SortArrBubbleAsc();
         ob.bubbleSort(arr3);
         System.out.println();
         System.out.println("----------------------------------------------");
         System.out.println("sorted array");
         ob.printArray(arr3);

     }
}
