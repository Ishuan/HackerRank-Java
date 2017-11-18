package introduction;

import java.util.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        String str;
        while(sc.hasNext()){
            str = sc.nextLine();
            System.out.println((n+1)+" "+str);
            n++;
        }
        sc.close();
       }
        
    }
