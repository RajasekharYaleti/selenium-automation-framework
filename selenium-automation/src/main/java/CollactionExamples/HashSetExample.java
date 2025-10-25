package CollactionExamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(20);
		set.add(2);
		set.add(20);    // Duplicates not allow 
		
		System.out.println("HashSet: "+set);

	}

}
