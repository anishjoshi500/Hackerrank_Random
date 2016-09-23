import java.util.Scanner;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String u="";
                if(x<100&&x!=0)
                {
                   u="0"+x;
                }
                else if(x==0)
                {
                    u="000";
                }
                else
                {
                   u=String.valueOf(x);
                }
                String t=String.format("%1$-15s", s1);
                System.out.println(t+u);
                //Complete this line
            }
            System.out.println("================================");

    }
}
