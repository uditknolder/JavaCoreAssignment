package Question5;
import java.util.Scanner;
class Main {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a number to find the factorial :");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of " + num+ " is " + factorial(num));
    }
}

