interface Mobile{
void ring();
void game();
}
public class Simple implements Mobile{
public static void main(String[] args){
Simple s = new Simple();
s.ring();
s.game();
}
public void ring() {
System.out.println("mobile is ringing");
}
public void game() {
System.out.println("gaming on mobile");
}
}