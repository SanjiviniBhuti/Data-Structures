package Arrays_Easy;


import java.util.*;

/**
 * Brute Force
 * Time Complexity: O(N*log(N))
 *
 * Space Complexity: O(n)
 *
 * Optimal
 * Time Complexity: O(N)
 *
 * Space Complexity: O(1)
 */
public class FindLargestElement {
    public static void main(String[] args) {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The Largest element is: " + findLargestBruteForce(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The Largest element is: " + findLargestOptimal(arr2));
    }

    private static int findLargestBruteForce(int[] arr) {
        Arrays.sort(arr);
        // returns last element of array after sorting
        return arr[arr.length - 1];
    }

    private static int findLargestOptimal(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
