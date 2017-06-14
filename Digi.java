import java.io.*;
import java.util.*;
class Digi
{
    public static void main(String args[])
    {
        int i=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0)
        {
            n=n/10;
            i++;
        }
        System.out.println(i);
    }
}
