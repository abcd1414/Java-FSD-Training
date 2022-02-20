// A student will not be allowed to sit in exam if his/her attendence is less than 75%.Take following input from user.Number of classes held,Number of classes attended,And print,percentage of class attended,Is student is allowed to sit in exam or not.




import java.util.*;
class Percentage
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("classes held");
 int x=sc.nextInt();
 System.out.println("classes attended");
 int y=sc.nextInt();
float f;
 f=((y*100)/x);
 System.out.println(f);
if(f>=75){
System.out.println("student is allowed to sit in exam"+ f);
}
else 
{
System.out.println("student is  not allowed to sit in exam"+ f);
}
}
}









