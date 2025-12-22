import java.util.*;
public class bill 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float total=a+b+c;
        float taxtotal=(total*0.18f)+total;
        System.out.print("the total is:"+total+"the total after GST is:"+taxtotal);
    }    
}
