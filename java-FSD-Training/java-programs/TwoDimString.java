import java.util.*;
public class TwoDimString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no of row and column:");
		int row= s.nextInt();
		int col= s.nextInt();
		String[][] arr1= new String[row][col];
		System.out.println("enter the array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=s.next();
			}
		}
		System.out.println(" array :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr1[i][j] +" , ");
			}
			System.out.println("");
		}
	   
			
			
		

	}

}