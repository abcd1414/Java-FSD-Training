import java.util.Scanner;
 
class Logicaloperator
{
   public static void main(String args[])
   {
      int x=10;
      int y=5; 
      int z=2;
      if ( x > y && x > z )
         System.out.println("true");
      else if ( y > x && y > z )
         System.out.println("false");
      if ( z > x|| z > y )
         System.out.println("one condition is true");
      else   
         System.out.println("both true");
 
   }
}