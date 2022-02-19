//program to use a Ternary operator and find the greatest of three numbers


class Greatest
{
public static void main(String args[])
{
int a=25;
int b=20;
int c=10; 
int max;
max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
System.out.println(" Greatest number is " + max );
}
}