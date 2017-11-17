package introduction;

import java.util.*;

class Java_Loops_II{
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for(int x=0;x<n;x++){
				int sum=0;
				for(int p=0;p<=x;p++){
					sum += ((int)(Math.pow(2,p)))*b;
				} sum += a;
				System.out.print(sum+" ");
			} 
			System.out.println();
		}
		in.close();
	}
}
