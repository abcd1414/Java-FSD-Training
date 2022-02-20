public class pgm1
{
public static void main(String[] args)
{
	try
	{
		try
		{
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception");
		} 
		int b=Integer.parseInt("");
	}
	catch(NumberFormatException e)
	{
		System.out.println("number format exception");
	}
	catch(NullPointerException e)
	{
		System.out.println("null pointer exception");
	}
}
}