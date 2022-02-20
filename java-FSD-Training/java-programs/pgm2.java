// Write a program to implement try catch block for String Index Out of Bounds.


public class pgm2
{
public static void main(String[] args)
{
	String str="hello";
	try
	{
	str.charAt(28);
	System.out.println("String index is valid");
	}
	catch (StringIndexOutOfBoundsException e)
	{
	System.out.println("String index is out of bounds");
	}
}
}