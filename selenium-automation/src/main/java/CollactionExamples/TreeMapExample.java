package CollactionExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map <String, Integer> map = new TreeMap<>();
		
		map.put("Rajasekhar", 1);
		map.put("Prerana", 3);
		map.put("Vani", 2);       // output will come with alphabetically
		
		System.out.println("TreeMap: "+ map);

	}

}
