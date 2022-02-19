//program to use a Ternary operator and find the smallest of three numbers.


class Smallest
{
public static void main(String args[])
{
int a=5;
int b=10;
int c=8;
int min;
min = (a < b) ? (a < c ? a : c) :(b < c ? b : c);
System.out.println("Smallest number"+ min);
}
}