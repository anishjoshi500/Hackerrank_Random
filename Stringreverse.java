import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder s=new StringBuilder();
        s=s.append(A);
        s=s.reverse();
        //System.out.println(A);
        //System.out.println(s);
        //boolean b=s.equals(A);
        if((s.toString()).equals(A))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
