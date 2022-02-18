public class Local
{
	int myLocal;
	static int a=2;
	public static void main(String[] args){
		int x=20;
		Local obj=new Local();
		System.out.println("value of instance variable:" +obj.myLocal);
		System.out.println("value of static variable:" +Local.a);
		System.out.println("value of local variable:" +x);
	}
}
