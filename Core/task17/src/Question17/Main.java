package Question17;


import java.util.Scanner;

public class Main
    {
        public static void main(String[] args)
        {
            try
            {
                int arr[] = new int[6];
                arr[10] = 100/0; //
            }

            catch(ArithmeticException ae)
            {
                System.out.println("A number cannot be divided by zero, Illegal operation in java \n"+ae+"\n");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Accessing array element outside of specified limit"+e+"");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(" out of try-catch block");
        }
    }

