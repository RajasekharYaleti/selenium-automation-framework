package CollactionExamples;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItaratorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		
		Iterator<String> iterator = list.iterator();    // used to traveling through collections
		
		while(iterator.hasNext() ) {
			System.out.println(iterator.next());
		}

	}

}
