import java.util.*;
class evenintervals
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the starting range");
        int a=s.nextInt();
        System.out.println(a);
        System.out.println("enter the ending range");
        int b=s.nextInt();
        System.out.println(b);
        while(a<b)
        {
            if(a%2==0)
        {
            System.out.println(a);
        }
         a=a+1;
        }
    }
}
