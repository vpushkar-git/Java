import java.util.*;
public class sumofnnum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=0,sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        //using while loop
        int sumwhile=0;
        while(n>0)
        {
            sumwhile=n+sumwhile;
            n--;
        }
        System.out.println(sumwhile);
    }    
}
