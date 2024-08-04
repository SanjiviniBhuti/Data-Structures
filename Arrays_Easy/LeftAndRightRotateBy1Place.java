package Arrays_Easy;

/**
 * Brute Force
 * Time Complexity: O(n), as we iterate through the array only once.
 *
 * Space Complexity: O(n) as we are using another array of size, same as the given array.
 *
 * Optimal
 * Time Complexity: O(n), as we iterate through the array only once.
 *
 * Space Complexity: O(1) as no extra space is used
 */
public class LeftAndRightRotateBy1Place {

    public static void main(String args[]) {
        int n=5;

        int arr[]= {1,2,3,4,5};
        leftRotateBruteForce(arr, n);
        System.out.println();
        rightRotateBruteForce(arr, n);
        System.out.println();
        leftRotateOptimal(arr, n);
        System.out.println();
        rightRotateOptimal(arr, n);
    }
    private static void leftRotateBruteForce(int[] arr, int n) {
        int temp[]=new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }

    private static void rightRotateBruteForce(int[] arr, int n) {
        int temp[]=new int[n];
        for (int i = 0; i < n-1; i++) {
            temp[i+1] = arr[i];
        }
        temp[0] = arr[n-1];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }

    private static void leftRotateOptimal(int arr[], int n) {
        int temp = arr[0]; // storing the first element of array in a variable
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void rightRotateOptimal(int arr[], int n) {
        int temp = arr[n-1]; // storing the last element of array in a variable
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[0] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
