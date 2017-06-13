import java.util.*;
class Greatest
{
     public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
         int num2=in.nextInt();
          int num3=in.nextInt();
    if (num1>num2)
    {
        if (num1>num3)
        {
        System.out.println("num1 is the greatest among three");
        }
        else
        {
        System.out.println("num3 is the greatest among three");
        }
    }
    else if(num2>num3)
        System.out.println("num2 is the greatest among three");
    else
        System.out.println("num3 is the greatest among three");
    }
}
