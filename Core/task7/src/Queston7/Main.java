package Queston7;

import java.util.Scanner;

public class Main {
    static int count = 0;
    String search;
    int len;
    String[] str;
    Main(String[] s,String srch){
        str = s;
        search = srch;
        len = s.length;
    }

    int call_me(int len) {

        if (len < 1) // base case
        {
            return count;
        } else if (str[len].equals(search)) {
            ++count;
        }
        return call_me(len - 1);
    }

    public static void main(String[] args) {
       String[] str={"udit","udit","udit","is","is","is","is","java_Developer","java_Developer","java_Developer","java_Developer","java_Developer"};

        Main obj;

        obj = new Main(str,"java_Developer");
        System.out.println(obj.search+" occurred "+obj.call_me(obj.len-1)+" times");

    }
}
