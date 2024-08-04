package Arrays_Easy;

/**
 * Brute Force
 * Time Complexity: O(N^2)
 *
 * Space Complexity: O(1)
 *
 * Optimal
 * Time Complexity: O(N)
 *
 * Space Complexity: O(1)
 */
public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;
        int arr1[] = {4, 5, 1, 2, 3}, m = 5;
        System.out.println(isSortedBruteForce(arr, n));
        System.out.println(isSortedBruteForce(arr1, m));

        System.out.println(isSortedOptimal(arr, n));
        System.out.println(isSortedOptimal(arr1, m));
    }

    private static boolean isSortedBruteForce(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    private static boolean isSortedOptimal(int[] arr , int n) {
        for(int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
