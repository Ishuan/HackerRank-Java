package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java_Substrings_Comparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		List<String> str = new ArrayList<String>();

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		for(int i=0;i<s.length()-(k-1);i++){
			str.add(s.substring(i,i+k));
		}

		Collections.sort(str);
		smallest = str.get(0);
		largest = str.get(str.size()-1);
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
