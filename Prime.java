package Recursion;
public class Prime
{
    boolean isPrime(int n,int i,int c)
    {
        if(n<i)
        {
            if(c==2)
                return true;
            else
                return false;
        }
        else 
        {
            if(n%i==0)
                c++;
            return isPrime(n,i+1,c);
        }
    }

    public static void main(String args[])
    {
        Prime obj=new Prime();
        for(int i=1;i<=50;i++)
        {
            if(obj.isPrime(i,1,0)==true)
                System.out.println(i);
        }
    }
}