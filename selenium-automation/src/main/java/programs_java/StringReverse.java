package programs_java;
import com.google.common.primitives.Chars;

public class StringReverse {
	
//	//Using BufferBuilder
	
//	public static void main(String[] args) {
//        String str = "anarerP itelaY";
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println("Reversed: " + reversed);
//    }


//	public static void main(String[] args) {
//	
//	
//	// Using CharArray
	// Explanation: Swap characters in the array from both ends.
	
	 public static void main(String[] args) {
		 String str = "Yaleti Rajasekhar";

				 char[] charArray = str.toCharArray();
				 for(int i=0, j= charArray.length-1; i<j; i++, j--){
				 char temp =charArray[i];
				 charArray[i] = charArray[j];
				 charArray[j] = temp;

				 }

				 String reversed = new String(charArray);
				 System.out.println("Reversed: "+ reversed);
	    }
	
	
	
	//Using For Loop
	
	// public static void main(String[] args) {
	
	// String input1 = "itelay";
	 
    // String reversed1 = "";
     
    // for (int i = input1.length() - 1; i >= 0; i--) {
        // reversed1 += input1.charAt(i); // inefficient for large strings
         
   //  }
     // System.out.println("Reversed: " + reversed1 );
		
		
	}

		

	


