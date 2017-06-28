import java.util.*;
class reversestring
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        System.out.println("enter the string to be reversed");
        sb.append(s.nextLine());
        System.out.println(sb.reverse());
    }
}
