import java.util.*;
class Number
{
     public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(num);
        if(num==0)
        {
            System.out.println("zero");
        }
        else if(num>0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
        /* code */
    }
}
