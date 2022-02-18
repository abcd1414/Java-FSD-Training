public class Methodoverload2{
   public int sub(int x, int y)
    {
        return (x - y);
    }
   public int sub(int x, int y, int z)
    {
        return (x - y - z);
    }
  public double sub(double x, double y)
    {
        return (x -y);
    }
public double sub(double x, double y, double z)
    {
        return (x -y -z);
    }
  public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(35, 20));
        System.out.println(s.sum(50, 20, 10));
        System.out.println(s.sum(30.5, 10.5));
	System.out.println(s.sum(40.5, 20.5, 10.5))
    }
}