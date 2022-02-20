// A student will not be allowed to sit in exam if his/her attendence is less than 75%.Take following input from user.Number of classes held,Number of classes attended,And print,percentage of class attended,Is student is allowed to sit in exam or not.




 import java.util.Scanner; 
public class Practice
{ 
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in); 
System.out.println("eligible to sit in exam or not?"); 
System.out.println("Enter the number of classes held"); 
int a = sc.nextInt(); 
System.out.println("Enter number of classes you were present"); 
int b = sc.nextInt(); 
float percentage = b*100.f/a; 
System.out.println("your total percentage attendance is " + percentage); 
if (percentage>=75){ 
System.out.println("you are eligible to sit in the exam"); 
} 
else{ 
System.out.println("you are not eligible to sit in the exam"); } } }








