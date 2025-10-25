package CollactionExamples;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Lion");
		linkedList.add("Tiger");
		linkedList.add("Lepord");
		
		System.out.println("LinkedList: "+linkedList);
		
		linkedList.addFirst("Elephent");
		linkedList.addLast("deer");
		
		System.out.println("After adding additional Wild animals: "+linkedList);
		// TODO Auto-generated method stub

	}

}
