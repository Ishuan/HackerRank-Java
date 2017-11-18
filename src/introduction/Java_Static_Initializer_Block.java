package introduction;

import java.util.*;

public class Java_Static_Initializer_Block {

	static Scanner sc = new Scanner(System.in);

	static boolean flag= false ;
	static int B;
	static int H;

	static{
		B = sc.nextInt();
		H = sc.nextInt();

		if(!(B>0 && H>0))
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		else
			flag =true;
	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		sc.close();
	}//end of main

}