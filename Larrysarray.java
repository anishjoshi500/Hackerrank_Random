import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tn=sc.nextInt();
        for(int i=0;i<tn;i++)
        {
            int c=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int p=0;p<n;p++)
            {
            for(int r=p+1;r<n;r++)
            {
            if(a[p]>a[r])
            c++;
            }
            }
            if(c%2==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
