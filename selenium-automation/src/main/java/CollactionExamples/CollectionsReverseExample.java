package CollactionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Rajasekhar");
		names.add("Prerana");
		names.add("Vani");
		
		Collections.reverse(names);
		
		System.out.println("List of reverse names: "+names);

	}

}
