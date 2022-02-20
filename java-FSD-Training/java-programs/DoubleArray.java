import java.util.*;
public class DoubleArray {
    public static void main(String[] args)
    {
        
    	Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of row");
    	int row =sc.nextInt();
        System.out.println("enter the size of col");
        int col =sc.nextInt();
        String[][] s1=new String[row][col];
        System.out.println("enter" +col+ "student details");
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for (int j = 0; i < col; i++) 
            {
                s1[i][j]=sc.next();
            }
        
        }
        for(int i=0;i<row;i++)
        {
            for (int j = 0; i < col; i++) 
            {
                System.out.println(" " +s1[i][j]);
            }
            System.out.println("");
        }
        for(int i=1;i<row;i++)
        {
            for (int j = 0; i < col; i++) 
            {
               int count=i-1;
               int temp=Integer.parseInt(s1[i][j]);
               if(temp>400)
               {
                   System.out.println(s1[count][j]+" is passed exam");
               }
               else
               {
                   System.out.println(s1[count][j]+" is not  passed exam");
               }
            }
           
        }
    }
        
}      