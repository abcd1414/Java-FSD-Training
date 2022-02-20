import java.util.Scanner;
public class Substring
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first string");
    String txt1=sc.next();
    System.out.println("enter the second string");
    String txt2=sc.next();

    boolean result=txt1.contains(txt2);
    if (result)
    {
    System.out.println(txt2 +"is present and its a substring");
    }
    else
    {
    System.out.println(txt2 +"is present and its a substring");
    }
  }
}

      
    
   