import java.util.*;
public class productfunction 
{
    public static int product()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int prod=a*b;
        System.out.println(prod);
        return prod;
    }
    public static void main(String args[])
    {
        product();
    }
}
