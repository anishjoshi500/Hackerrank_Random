public static int B;
public static int H;
public static boolean flag;
static
{
Scanner sc=new Scanner(System.in);
B=sc.nextInt();
H=sc.nextInt();
flag=false;
if(B>0&&H>0)
{
    flag=true;
}
else
{
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}
