import java.util.*;
public class CharArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows and coumns:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char[][] arr=new char[a][b];
		System.out.println("enter the array elements");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				arr[i][j]=sc.next().charAt(0);
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(arr[i][j]+" , ");
			}
			System.out.println("");
		}
		
		

	}

}