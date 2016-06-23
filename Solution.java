import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
            {
            int result=1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for(int i =0;i<n;i++)
                {
                a = a + (result*b);
                System.out.print(a + " ");
                result = result*2;
            }
            System.out.println();
        }
        
    }
}