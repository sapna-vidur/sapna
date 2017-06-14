import java.util.*;
class Summ
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int n1=s.nextInt();
        for(int i=0;i<=n1;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
