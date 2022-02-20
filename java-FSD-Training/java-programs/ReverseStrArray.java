import java.util.Scanner;
public class ReverseStrArray
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String s1=sc.next();
    char[] c=s1.toCharArray();
    System.out.println("character array are");
    for(int i=0;i<c.length;i++)
    {
    	System.out.println(c[i]);
    }
    System.out.println();
    System.out.println(              );

    System.out.println("reverse array");
    for(int i=c.length-1;i>=0;i--)
    {
    	System.out.println(c[i]);
    }
    char ch;
    String rev="";
    for(int i=0;i<s1.length();i++)
    {
    	ch=s1.charAt(i);
    	rev=ch+rev;
    }
    System.out.println();
    System.out.println("reverse character arrray of string" +rev);
   }
}