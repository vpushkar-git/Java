import java.util.*;
public class prime 
{
    public static void main(String argsp[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("entered number is prime number.");
        }
        else
        {
            System.out.println("entered number is not prime number.");
        }
    }    
}
