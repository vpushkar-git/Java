import java.util.*;
public class leapyear 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check: ");
        int year=sc.nextInt();
        if(year%4==0)
            {
                System.err.println("It is leap year");
            }
            else
                {
                    System.err.println("not a leap year");
                }    
    }    
}
