import java.util.*;
class prime
{
    public static void main(String args[])
    {
        int flag=0;
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        System.out.println(n1);
        for(int i=2;i<=n1/2;i++)
        {
            if(n1%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not a prime");
        }
    }
}
