package programs_java;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		
		int a = in.nextInt();
		
		System.out.println("Enter 2nd Number");
		
		int b = in.nextInt();
		
		System.out.println("before Swapping a="+a+" and b="+b);
		
		int x =a;
		
		a=b;
		
		b = x;
		System.out.println("After Swapping a="+a+" and b= "+b);

	}

}
