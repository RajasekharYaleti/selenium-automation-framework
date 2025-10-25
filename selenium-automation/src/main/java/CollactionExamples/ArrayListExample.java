package CollactionExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); 
		list.add("Rajasekhar");
		list.add("Prerana");
		list.add("Vani");
		list.add("Yaleti");
		list.add("Rajasekhar");     // Duplicates all in ArrayList
		
		System.out.println("ArrayList: "+list);
		
		list.remove("Yaleti");
		
		System.out.println("After removel:"+list);
		
		System.out.println("contains 'Prerana': "+list.contains("Prerana"));

	}

}
