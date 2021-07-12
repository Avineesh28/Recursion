package Recursion;
import java.util.*;
public class Rev
{
    String s;
    Rev()
    {
        s="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter String");
        s=sc.nextLine();
        s=" "+s;
    }
    void str(int i,String w)
    {
        if(i==-1)
            return;
        else
        {
            if(s.charAt(i)==' ')
            {
                System.out.println(w);
                w="";
                str(i-1,w);
            }
            else
            {
                w=s.charAt(i)+w;
                str(i-1,w);
            }
        }
    }
    public static void main(String args[])
    {
        Rev obj=new Rev();
        obj.input();
        obj.str(obj.s.length()-1,"");
    }
}
        
 