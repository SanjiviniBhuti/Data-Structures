package Arrays_Easy;

import java.util.HashSet;

/**
 * Brute Force
 * Time complexity: O(n*log(n))+O(n)
 *
 * Space Complexity: O(n)
 *
 * Optimal
 * Time Complexity: O(N)
 *
 * Space Complexity: O(1)
 */
public class RemoveDuplicatesInPlaceInSortedArray {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicatesBruteForce(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int l = removeDuplicatesOptimal(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicatesBruteForce(int[] arr){
        HashSet< Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }

    private static int removeDuplicatesOptimal(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
