import java.util.*;
class ams
{
    public static void main(String args[])
    {
        int a=0,s1=0,temp;
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        System.out.println(n1);
        temp=n1;
        while(n1!=0)
        {
          a=n1%10;
          s1=s1+(a*a*a);
          n1=n1/10;
        }
        if(temp==s1)
        {
            System.out.println("number is armstrong");
        }
        else
        {
            System.out.println("number is not an armstrong");
        }
    }
}
