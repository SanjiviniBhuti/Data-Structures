package Arrays_Easy;

import java.util.Arrays;

public class FindSecondLargestAndSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getSecondLargestAndSmallestBruteForce(arr, n);
        getSecondLargestAndSmallestBetterApproach(arr, n);
        System.out.println(getSecondSmallestOptimal(arr, n));
        System.out.println(getSecondLargestOptimal(arr, n));
    }

    /**
     * Note: This solution works only if there are no duplicates in the array
     * Time Complexity: O(NlogN), For sorting the array
     *
     * Space Complexity: O(1)
     *
     */
    private static void getSecondLargestAndSmallestBruteForce(int[] arr, int n) {
        if (n == 0 || n==1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];
        System.out.println("Second smallest is "+small);
        System.out.println("Second largest is "+large);
    }

    /**
     * Time Complexity: O(2N) = O(N), We do two linear traversals in our array
     *
     * Space Complexity: O(1)
     */
    private static void getSecondLargestAndSmallestBetterApproach(int[] arr, int n) {
        if (n == 0 || n==1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0;i < n;i++) {
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        System.out.println("Second smallest is "+second_small);
        System.out.println("Second largest is "+second_large);
    }

    /**
     *Time Complexity: O(N), Single-pass solution
     *
     * Space Complexity: O(1)
     */
    private static int getSecondSmallestOptimal(int[] arr, int n)
    {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] < small)
            {
                second_small = small;
                small = arr[i];
            }
            else if (arr[i] < second_small && arr[i] != small)
            {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    /**
     * Time Complexity: O(N), Single-pass solution
     *
     * Space Complexity: O(1)
     */
    static private int getSecondLargestOptimal(int[] arr, int n)
    {
        if(n<2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
}
