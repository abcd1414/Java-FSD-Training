import java.util.LinkedList;
import java.util.Queue;

public class Queuesample_double
{
	public static void main(String[] args)
	{
		Queue<Double> que1= new LinkedList<>();
		Queue<Double> que2= new LinkedList<>();
		que1.add(200.5);
		que1.add(50.7);
		que1.add(60.8);
		System.out.println("Initial queue "+ que1);
		que1.remove();
		System.out.println("after remove queue 1" +que1);
		que2.add(200.5);
		que1.addAll(que2);
		System.out.println("after addAll" +que1);

		int size=que2.size();
		System.out.println("size of queue 2 "+size);
		que2.clear();
		System.out.println("after clear() check if queue2 is empty: "+ que2.isEmpty());
		System.out.println("checking element 50.7 is in queue1: "+ que1.contains(50.7));


                           
            
	}
}
