package Strings;

import java.util.Scanner;

public class Java_Strings_Introduction {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int len = A.length()+B.length();
		int cmp = A.compareTo(B);

		String new_A = A.substring(0,1).toUpperCase()+A.substring(1,A.length());
		String new_B= B.substring(0,1).toUpperCase()+B.substring(1,B.length());

		System.out.println(len);

		if(cmp>0)
			System.out.println("Yes");
		else
			System.out.println("No");

		System.out.println(new_A+" "+new_B);

		sc.close();


	}
}
