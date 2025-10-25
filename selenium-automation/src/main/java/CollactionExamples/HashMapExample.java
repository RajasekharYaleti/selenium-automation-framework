package CollactionExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Orange", 3);
		map.put("Banana", 2);
		
		System.out.println("HashMap: "+map);
		
		System.out.println("Value for key 'Banana': " + map.get("Banana"));

	}

}
