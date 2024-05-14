package Recursion;

/**
 * Time Complexity: O(1)
 *
 * Space Complexity: O(1)
 */
public class R4SumOfFirstNNumbersUsingFormula {

    public static void solve(int N) {
        int sum = N * (N + 1) / 2;
        System.out.println("The sum of the first " + N + " numbers is: " + sum);
    }
    public static void main(String[] args) {
        solve(6);
        solve(8);
    }
}
