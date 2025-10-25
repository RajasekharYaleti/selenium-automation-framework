package CollactionExamples;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list =  new CopyOnWriteArrayList<>();
		list.add("Rajasekhar");
		list.add("Prerana");
		list.add("Vani");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		list.add("Yaleti");
		System.out.println("Updated list: " +list);
	}

}
