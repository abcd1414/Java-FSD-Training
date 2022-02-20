import java.util.*;
import java.util.Queue;

public class PriorityQ {

   public static void main(String[] args) {

                  PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

                  pq.add(12);

                  pq.add(67);

                  pq.add(78);

                  pq.add(45);

                  pq.add(33);

                  System.out.println("priority queue is :"+pq);

                 System.out.println("head of the queue is "+pq.peek());

                  System.out.println("size of the queue is "+pq.size());

                  boolean removed =pq.remove(78);

                  System.out.println(removed);

                  pq.poll();

                  System.out.println("priority queue is : "+pq);

                  System.out.println("is priority queue empty? "+pq.isEmpty());

                  System.out.println("priority queue contains 33 ? "+pq.contains(33));

               

}

}