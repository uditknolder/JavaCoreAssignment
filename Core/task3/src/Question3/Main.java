package Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = "abcdefabcdeabcdaaa";
        System.out.println("\nEnter a character which you want to remove :");
        char g_char = sc.next().charAt(0);
        String result = remove_Character(str1, g_char);
        System.out.print("Original string:");
        System.out.println(str1);
        System.out.print("Second string:");
        System.out.println(result);
    }
    public static String remove_Character(String str1, char g_char) {
        if (str1 == null || str1.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] chArray = str1.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != g_char) {
                sb.append(chArray[i]);
            }
        }
        return sb.toString();
    }
}

