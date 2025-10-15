package programs_java;

public class MinMaxArray {

	public static void main(String[] args) {
		
		int[] nums = {20, 90, 100, 120, 30};
		 int min = nums[0];
		 int max = nums[0];
		 
		 for(int n : nums) {
		 if(n < min) min = n;
		 if(n > max) max = n;
		 }
		 
		 System.out.println("min: " +min+ ",max: " + max);

	}

}
