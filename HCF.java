package Recursion;
import java.util.*;
public class HCF
{
    int check(int g,int s)
    {
        if(g%s==0)
            return s;
        else
        {
            int r=g%s;
            return check(s,r);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        HCF obj=new HCF();
        System.out.println("Enter numbers");
        int m=sc.nextInt();
        int n=sc.nextInt();
        m=obj.check(Math.max(m,n),Math.min(m,n));       
        System.out.println("HCF="+m);        
    }
}