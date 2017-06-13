import java.util.*;
class Alphabet
{
     public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        char a=in.next().charAt(0);
        System.out.println(a);
        if((a>='a' && a<='z')||(a>='A' && a<='Z'))
        {
            System.out.println("alphabet");
        }
        else
        {
            System.out.println("not an alphabet");
        }
    
    }
}
