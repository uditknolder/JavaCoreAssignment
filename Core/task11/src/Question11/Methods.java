package Question11;

import java.util.Objects;
import java.util.Scanner;

public class Methods {
    static String str;
    static int cost;
    static  int token_no;
     void Cashier()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("============:::Coffee Shop :::=========");
        System.out.println("We are Having these Flavours for the Coffee:");
        System.out.println("French Vanilla =======> 20Rs\n" +
                "Caramel Macchiato. =======> 30 Rs\n" +
                "Pumpkin Spice.=======> 40 Rs\n" +
                "Mocha.========> 50 Rs\n" +
                "Hazelnut. 60 Rs");
        System.out.println("Enter Your Order :");
        str=sc.nextLine();
        System.out.println("Please pay the cost of "+str+"flavour:");
        cost=sc.nextInt();

    }
    void Customer()
    {
        if ((Objects.equals(str, "vanilla")) && (cost==20))
        {
            token_no=50;
            System.out.println("Your Token no is :"+token_no);
            System.out.println("please Wait 3 min for Your order :");
        }
        else if((Objects.equals(str, "macchiato")) &&(cost==30))
        {   token_no=100;
            System.out.println("Your Token no is  :"+token_no);
            System.out.println("please Wait 3 min for Your order :");
        }
        else if((Objects.equals(str, "pumpkin"))&&(cost==40))
        {
            token_no=200;
            System.out.println("Your Token no is :"+token_no);
            System.out.println("please Wait 3 min for Your order :");
        }
        else if((Objects.equals(str, "mocha"))&&(cost==50))
        {
            token_no=300;
            System.out.println("Your Token no is  :"+token_no);
            System.out.println("please Wait 3 min for Your order :");
        }
        else if((Objects.equals(str, "hazelnut"))&&(cost==60))
        {
            token_no=400;
            System.out.println("Your Token no is :"+token_no);
            System.out.println("please Wait 3 min for Your order :");
        }
        else
        {
            System.out.println("either Your choice is not available in our store or you have not paid right amount  :");
        }

    }
    void Barista() {
        if (token_no == 50) {
        System.out.println("please collect Your Order"+str);
            System.out.println("You have paid Rs"+cost+" for Your Order");
        }
        if (token_no == 100) {
            System.out.println("please collect Your Order"+str);
            System.out.println("You have paid Rs"+cost+" for Your Order");
        }
        if (token_no == 200) {
            System.out.println("please collect Your Order"+str);
            System.out.println("You have paid Rs"+cost+" for Your Order");
        }
        if (token_no == 300) {
            System.out.println("please collect Your Order"+str);
            System.out.println("You have paid Rs"+cost+" for Your Order");
        }
        if (token_no == 400) {
            System.out.println("please collect Your Order :"+str);
            System.out.println("You have paid Rs "+cost+" for Your Order");
        }
    }
}
