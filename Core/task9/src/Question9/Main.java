package Question9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for SBI details :");
        System.out.println("enter 2 for BOI details :");
        System.out.println("enter 3 for ICICI details :");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                SBI sb=new SBI();
                sb.Sbi();
                break;
            case 2:
                BOI bi=new BOI();
                bi.Boi();
                break;
            case 3:
               ICICI ic=new ICICI();
               ic.icici();
                break;


        }

    }

}
