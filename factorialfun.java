import java.util.*;
public class factorialfun 
{
    public static int factorial()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial is:"+f);
        return f;
    }
    public static void main(String args[])
    {
        factorial();
    } 
}
