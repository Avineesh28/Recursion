package Recursion;
import java.util.*;
public class Sum
{
    int n;
    Sum()
    {
        n=0;
    }
    double series(int i)
    {
        double s=0.0;
        if(i<=n)
        {
            int sum=0;
            int m=1;
            for(int j=1;j<=i;j++)
            {
                sum+=j;
                m*=j;
            }
            s=s+sum/m;
            return s+series(i+1);
        }
        else
            return 0.0;
    }
    public static void main(String args[])
    {
        Sum obj=new Sum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        obj.n=sc.nextInt();
        double s=obj.series(1);
        System.out.println(s);
     }
}