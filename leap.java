import java.util.*;
class Leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n);
        if(n%4==0)
        {
            System.out.println("leap year");
        }
            else
            {
                System.out.println("non-leap year");
            }
        
        
    }
}
