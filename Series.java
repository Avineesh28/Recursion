package Recursion;
import java.util.*;
public class Series
{
    int n,c,a;
    Series(int n,int a)
    {
        this.n=n;
        this.a=a;
        c=0;
    }
    double sum(int d)
    {
        double s=0.0;
        int m=1;
        if(c<=n)
        {
            for(int i=1;i<=d;i++)
                m*=i;
            s=s+Math.pow(a,d)/m;
            c++;
            return s+sum(d+2);
        }        
        else
            return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n & a");
        int n=sc.nextInt();
        int a=sc.nextInt();
        Series obj=new Series(n,a);
        System.out.println(obj.sum(1));
     }
}