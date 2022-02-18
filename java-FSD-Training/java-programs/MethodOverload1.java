class Program
{
void run()
{
System.out.println("Program is running");
}
}
class Java extends Program
{
void run()
{
System.out.println("java program is running");
}
}
class Python extends Program
{
void run()
{
System.out.println("python program is running");
}
}
class C extends Program
{
void run()
{
System.out.println("c program is running");
}
}
class MethodOverload1
{
public static void main(String[] args)
{
Program p= new Java();
Java j= new Java();
Python t= new Python();
Program e= new Program();
C c= new C();
p.run();
j.run();
t.run();
e.run();
c.run();
}
}
