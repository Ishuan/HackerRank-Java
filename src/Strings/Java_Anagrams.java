package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Java_Anagrams {


	static boolean isAnagram(String a, String b) {
		int count=0;
		HashMap<Character,Integer> anag_a = new HashMap<Character, Integer>();
		HashMap<Character,Integer> anag_b = new HashMap<Character, Integer>();
		a = a.toLowerCase();
		b = b.toLowerCase();
		for(int i=0;i<a.length();i++) {
			count= 0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j))
					count++;
			}
			anag_a.put(a.charAt(i), count);
		}

		for(int i=0;i<b.length();i++) {
			count= 0;
			for(int j=0;j<b.length();j++) {
				if(b.charAt(i)==b.charAt(j))
					count++;
			}
			anag_b.put(b.charAt(i), count);

		}

		return (anag_a.equals(anag_b)? true:false);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}