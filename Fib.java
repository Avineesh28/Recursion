package Recursion;
import java.util.*;
public class Fib
{
    int n,c;
    Fib(int n)
    {
        this.n=n;
        c=2;
    }
    int series(int a,int b)
    {
        int s=0;
        int d=0;
        if(c<n)
        {
            d=a+b;
            if(c==2)
                s+=a+b+d;
            else
                s+=d;
            c++;
            return s+series(b,d);
        }
        else
            return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        Fib obj=new Fib(n);
        n=obj.series(0,1);
        System.out.println(n);
     }
}