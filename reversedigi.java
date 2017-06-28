import java.util.*;
class reversedigi
{
    public static void main(String args[])
    {
        int r,sum=0,d=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0)
        {
            r=n%10;
            sum=(sum*10)+r;
            d=d/10;
        }
        System.out.println(s);
    }
}
