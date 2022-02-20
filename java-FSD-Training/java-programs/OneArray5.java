import java.util.*;
class OneArray5
{
	public static void main(String[] args)
	{
		/*String[] arr={"Adithya","arun","swetha"};
		System.out.println(arr[1]);*/
		System.out.println("enter the size of string array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		char[] arr=new char[size];
		System.out.println("enter the character values of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);  // three
		}
		System.out.println("the values entered is:-");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

	}
}