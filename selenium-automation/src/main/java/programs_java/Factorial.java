package programs_java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("enter the num for which u want the factorial");

		int num = in.nextInt();

		for(int i=num-1; i>0; i-- ){

		num = num*i;

		}

		System.out.println("Factorial num is: "+num);
		
		


	}

}
