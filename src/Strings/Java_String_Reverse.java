package Strings;

import java.util.Scanner;

public class Java_String_Reverse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		/* Enter your code here. Print output to STDOUT. */
		
		String palin_A = new StringBuffer(A).reverse().toString();

		if(A.equals(palin_A))
			System.out.println("Yes");
		else
			System.out.println("No");

		sc.close();

	}
}
