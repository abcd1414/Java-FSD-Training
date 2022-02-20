class ExmpIfElse
{
	public static void main(String[] args)
	{
		int a=30,b=20,c=10;
		if(a>b && a>c)
		{
			System.out.println("A is the greatest");
			if(a%c==0)
			{
				System.out.println("A is completely divisible by C");
			}
		}
		else if(b>a && b>c)
		{
			System.out.println("B is the greatest");
		}
		else
		{
			System.out.println("C is the greatest");
		}
	}
}