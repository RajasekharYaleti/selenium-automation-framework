package programs_java;

import java.util.HashSet;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 20, 20};
		 
		 HashSet<Integer> set = new HashSet<>();
		 
		 for (int num : nums) {
		    if(!set.add(num)){
			System.out.println("Dulicate number is: "+ num);
			
			}
			}
		 }
}

		
	