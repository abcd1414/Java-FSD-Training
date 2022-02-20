// Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.



import java.util.Scanner;

public class Primenum
{
   public static void main(String[] args)
   {
      int num, i, flag=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      
      for(i=2; i<num; i++)
      {
         if(num%i == 0)
         {
            flag++;
            break;
         }
      }
      
      if(flag==0)
         System.out.println("It is a Prime Number.");
      else
         System.out.println("It is not a Prime Number.");
   }
}
