package CollactionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithComparator {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Raja");
		list.add("Sekhar");
		list.add("Yaleti");
		
		
		Collections.sort(list, (a,b) ->b.compareTo(a));   // sort in reverse order using comparator
		
		System.err.println("Sorted names (reverse): "+list);

	}

}
