package Question13;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 if you want to take the books from library  :");
        System.out.println("Enter 2 for Information of books availability  :");
        System.out.println("Enter 3 for feedback :");

        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                User u=new User();
                u.Register();
                u.Login();
                u.get_book_info();
                u.Book_request();
                u.Feedback();
                break;
            case 2:
                User ub=new User();
                ub.get_book_info();
                System.out.print("press y if you want to take book ");
                System.out.print("press n if you want to exit ");
                String str=sc.next();
                if(Objects.equals(str, "y"))
                {
                    ub.Register();
                    ub.Login();
                    ub.Book_request();
                }
                if (Objects.equals(str, "n"))
                {
                    break;
                }
               break;
            case 3:
                User uf=new User();
                uf.Feedback();
                break;

        }

    }
}
