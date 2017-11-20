package Strings;

import java.util.Scanner;
public class Java_String_Tokens {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
      String s1 = s.trim();
      
        String str[] = s1.split("[ !,'?.@_]+");  
      int l = str.length;
      
      if (s1.equals("")){
        System.out.println("0");
        return;
        }
      
      else if (l>400000)
        return;
      else
        System.out.println(str.length);
      
      for(int i=0;i<str.length;i++)
        System.out.println(str[i]);
        scan.close();
    }
}
