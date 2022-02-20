class ThisExmp1
{
	int sum;
	ThisExmp1(int sum)
	{
		this.sum=sum;
	}
	void display()
	{
		System.out.println("sum="+sum);
	}
	public static void main(String[] args)
	{
		ThisExmp1 obj=new ThisExmp1(500);
		obj.display();

	}
}