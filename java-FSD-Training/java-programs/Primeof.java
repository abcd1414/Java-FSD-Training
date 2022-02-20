// Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
import java.util.Scanner;
public class Primeof()
{
public static void main(String[] args)
{
int x,y;
Scanner s= new Scanner(System.in);
x=s.nextInt();
System.out.println("enter first number:");
y=s.nextInt();
System.out.println("enter second number:");
if(x%y==0)
{
System.out.println("Prime number");
}
else
{
System.out.println("not prime");
}
}
}
