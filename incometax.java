import java.util.*;
public class incometax 
{
    public static void main(String args[])
    {
        int tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary=sc.nextInt();
        if(salary < 500000)
        {
            tax=0;
        }
        else if(salary >= 500000 && salary < 1000000)
        {
            tax=(int) (salary*0.20);
        }
        else
        {
            tax=(int) (salary*0.30);
        }
        System.out.println("The tax on your salary is: "+tax);
    }    
}
