import java.util.*;
class Alpha
{
     public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        char a=in.next().charAt(0);
        System.out.println(a);
        if(a=='a'|| a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            System.out.println("vowel");
        }
        else
        {
        
            System.out.println("consonant");
        }
        

    }
}
