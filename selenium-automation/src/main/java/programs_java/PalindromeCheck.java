package programs_java;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String str = "madam";
		  String reversed = new StringBuilder(str).reverse().toString();
		  
		  if(str.equals(reversed)) {
		  System.out.println(str +" is palidrome is reversed");
		  } else {
		  System.out.println(str +" is not palidrome");
		  }

	}

}
