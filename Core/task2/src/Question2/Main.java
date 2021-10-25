package Question2;

import java.util.*;

class Main
{

    public static void sort_binary_numbers(int[] b_nums)
    {
        int k = 0;

        for (int i = 0; i < b_nums.length; i++)
        {
            if (b_nums[i] == 0) {
                b_nums[k++] = 0;
            }
        }

        for (int i = k; i < b_nums.length; i++) {
            b_nums[k++] = 1;
        }
    }

    public static void main (String[] args)
    {
        int binary_numbers[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Original array before Sorting is: "+Arrays.toString(binary_numbers));
        sort_binary_numbers(binary_numbers);
        System.out.println("Array after sorting is: "+Arrays.toString(binary_numbers));

    }
}
