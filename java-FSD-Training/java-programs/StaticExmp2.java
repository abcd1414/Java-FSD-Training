class StaticExmp2
{
	static int cube(int x)
	{
		return x*x*x;
	}
	int square(int x)
	{
		return x*x;
	}
	public static void main(String[] args)
	{
		int result=cube(3);
		StaticExmp2 obj=new StaticExmp2();
		int res=obj.square(5);
		System.out.println(result);
		System.out.println(res);
	}
}