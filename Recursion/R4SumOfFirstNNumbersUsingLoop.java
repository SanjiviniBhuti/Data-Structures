package Recursion;

/**
 * Time Complexity: O(N)
 *
 * Space Complexity: O(1)
 */
public class R4SumOfFirstNNumbersUsingLoop {
    public static void solve(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }

    public static void main(String[] args) {
        solve(6);
        solve(8);
    }
}
