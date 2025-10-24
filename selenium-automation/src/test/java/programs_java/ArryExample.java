package programs_java;

import java.util.ArrayList;

public class ArryExample {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Rajasekhar");
        names.add("Kiran");
        names.add("Asha");
        names.add("Rajasekhar"); // duplicate allowed

        // Get element
        System.out.println(names.get(1)); // Output: Kiran

        // Loop through list
        for (String name : names) {
            System.out.println(name);
        }

        // Remove an element
        names.remove("Asha");

        // Get size
        System.out.println("Total names: " + names.size());
		
	}

}
