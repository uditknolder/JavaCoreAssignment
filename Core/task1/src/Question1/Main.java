package Question1;

import java.util.*;
public class Main
{
    public boolean popInTheString(String stng)
    {
        int len = stng.length();
        for (int i = 0; i < len - 2; i++)
        {
            if (stng.charAt(i) == 'p' && stng.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Main m= new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str1 =  sc.next();
        System.out.println(m.popInTheString(str1));
    }
}

