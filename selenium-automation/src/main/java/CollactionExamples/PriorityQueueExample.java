package CollactionExamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(4);
		
		System.out.println("PriorityQueue "+ pq);
		
		System.out.println("Poll: "+pq.poll());
		System.out.println("after Poll: "+ pq);
	}

}
