package Arrays_Easy;

/**
 * Brute Force
 * Time Complexity: O(N)
 *
 * Space Complexity: O(k) since k array element needs to be stored in temp array
 *
 * Optimal
 * Time Complexity - O(N) where N is the number of elements in an array
 *
 * Space Complexity - O(1) since no extra space is required
 */
public class LeftAndRightRotateByDPlaces {
    public static void RotatetorightBrute(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void RotatetoleftBrute(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Function to Rotate k elements to right
    public static void RotatetorightOptimal(int[] arr, int n, int k) {
        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }

    public static void RotatetoleftOptimal(int[] arr, int n, int k) {
        // Reverse first k elements
        Reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        Reverse(arr, k , n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        RotatetorightBrute(arr, n, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        RotatetoleftBrute(arr, n, k);
        System.out.println("After Rotating the elements to left ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        RotatetorightOptimal(arr, n, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        RotatetoleftOptimal(arr, n, k);
        System.out.println("After Rotating the elements to left ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
