package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Loops_I {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=10;i++){
            int prd = N*i;
            System.out.printf("%d x %d = %d\n",N,i,prd);
        }
    }
}