import java.lang.*;
class ExceptionExmp6
{
	public static void main(String[] args)
	{
		try
		{
			int[] arr1=new int[5];
			System.out.println(arr1[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}