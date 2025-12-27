import java.util.*;
public class calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("Press 1 for addition. ");
        System.out.println("Press 2 for subtraction. ");
        System.out.println("Press 3 for multiplication. ");
        System.out.println("Press 4 for division. ");
        int ch=sc.nextInt();
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        switch(ch)
        {
            case 1:
                {
                    System.out.println(a+b);
                }
            case 2:
                {
                    System.out.println(a-b);
                }
            case 3:
                {
                    System.out.println(a*b);
                }
            case 4:
                {
                    System.out.println(a/b);
                }
        }
    }    
}
