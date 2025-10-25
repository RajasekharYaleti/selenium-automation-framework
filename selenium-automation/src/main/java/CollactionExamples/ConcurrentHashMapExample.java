package CollactionExamples;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
		hashMap.put("Rajasekhar", 1);
		hashMap.put("Vani", 2);
		hashMap.put("Prerana", 3);
		
		System.out.println("ConcurrentHashMap: "+ hashMap);
		
		hashMap.putIfAbsent("Yaleti", 4);
		System.out.println("After PutIfAbsent: "+ hashMap);
	}

}
