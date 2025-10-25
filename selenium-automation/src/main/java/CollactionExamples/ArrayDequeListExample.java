package CollactionExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeListExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("Apple");
		deque.addLast("Banana");
        deque.addFirst("Mango");
        
        
        System.out.println("Deque: "+ deque);
        
        System.out.println("Remove First: "+ deque.removeFirst());
        System.out.println("After remove: "+ deque);
	}

}
