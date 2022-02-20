class Animal
{
	String color="white";
}
class SuperExmp1 extends Animal
{
	String color="brown";
	public void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);// super key focus on class which is extended
	}
	public static void main(String[] args)
	{
		SuperExmp1 obj1=new SuperExmp1();
		obj1.printcolor();
	}
}