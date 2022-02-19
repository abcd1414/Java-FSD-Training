public class Mobile implements Phone {
void game();
void ring();
}
public static void main(String[] args)
{
void game()
{
System.out.println("gaming on mobie");
}
void ring()
{
System.out.println("mobile is ringing");
}
Mobile m = new Mobile();
m.game();
m.ring();
}


