import java.util.LinkedList;
import java.util.Queue;

public class Queuesample
{
	public static void main(String[] args)
	{
		Queue<String> que1= new LinkedList<>();
		Queue<String> que2= new LinkedList<>();
		que1.add("Monday");
		que1.add("Tuesday");
		que1.add("friday");
		System.out.println("Initial queue "+ que1);
		que1.remove();
		System.out.println("after remove queue 1" +que1);
		que2.add("Monday");
		que1.addAll(que2);
		System.out.println("after addAll" +que1);

		int size=que2.size();
		System.out.println("size of queue 2 "+size);
		que2.clear();
		System.out.println("after clear() check if queue2 is empty: "+ que2.isEmpty());
		System.out.println("checking element Monday is in queue1: "+ que1.contains("Monday"));


                           
            
	}
}

