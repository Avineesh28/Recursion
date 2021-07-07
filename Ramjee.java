package Recursion;
import java.util.*;
public class Ramjee
{
    int x;
    boolean flag;
    Ramjee()
    {
        flag=false;
        x=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number to be checked");
        x=sc.nextInt();
    }
    void Ramjee_check(int x)
    {
        int t=x;
        x=0;
        while(t>0)
        {
            int c=t%10;
            x=x+(c*c);
            t=t/10;
        }
        if(x<10)
        {
            if(x==1)
                flag=true;
            else 
                flag=false;
        }
        else
            Ramjee_check(x);
    }
    void display()
    {
        if(flag==true)
            System.out.println(" Ramjee Number");
        else
            System.out.println("Not a Ramjee Number");
    }
    public static void main(String args[])
    {
        Ramjee obj=new Ramjee();
        obj.input();
        obj.Ramjee_check(obj.x);
        obj.display();
    }
}
