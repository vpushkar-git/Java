import java.util.*;
public class oddeven 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Enter another number: ");
        int b=sc.nextInt();
        if(a%2==0)
        {
            System.out.println(a+" is even");
        }
        else
        {
            System.out.println(a+" is odd");
        }
        if(b%2==0)
        {
            System.out.println(b+" is even");
        }
        else
        {
            System.out.println(b+" is odd");
        }
    }    
}
