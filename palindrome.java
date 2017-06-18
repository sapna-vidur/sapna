import java.util.*;
class palindrome
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
          s1=s1*10+a;
          n1=n1/10;
        }
        if(temp==s1)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
