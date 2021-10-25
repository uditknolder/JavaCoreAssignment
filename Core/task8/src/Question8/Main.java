package Question8;

import java.util.Scanner;

public class Main {
    static String First_name;
    static String Last_name;
    static int age;
    static void show_your_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Name :");
        First_name=sc.next();
        System.out.println("Enter Your Last Name :");
        Last_name=sc.next();
        System.out.println("Enter Your Age :");
        age=sc.nextInt();
        System.out.println("Your Name is :"+First_name+Last_name);
        System.out.println("Age is :"+age);
    }
    public static void main(String args[])
    {
        Main obj=new Main();
        obj.show_your_details();

    }
}
