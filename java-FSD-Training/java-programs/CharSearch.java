import java.util.*;
public class CharSearch
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String s1=sc.next();
    char[] c=s1.toCharArray();
    System.out.println("enter no of character");
    int len=sc.nextInt();
    char[] array1=new char[len];
    System.out.println("enter the character");
    for(int i=0;i<len;i++)
    {
    	array1[i]=sc.next().charAt(0);
    }
    for(int i=0;i<array1.length;i++)
    {
        int result=s1.indexOf(array1[i]);
        if(result!=1)
        {
            System.out.println(array1[i] +"is present and its a substring");

        }
        else
        {
            System.out.println(array1[i] +"is not substring");

        }
    }
  }
}







