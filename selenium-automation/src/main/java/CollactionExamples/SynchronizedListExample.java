package CollactionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {

	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		list.add(1);
		list.add(2);
		list.add(3);
		
		synchronized (list) {
			for (int num : list) {
				System.out.println(num);
			}
			
		}

	}

}
