package Recursion;

/***
 * Time Complexity: O(n)
 *
 * Space Complexity: O(n)
 */
public class R5FactorialRecursive {
    static int factorial(int X) {
        if(X == 0 || X == 1)
            return 1;
        return X * factorial(X-1);
    }
    public static void main(String[] args) {
        int X = 5;
        int result = factorial(X);
        System.out.println("The factorial of " + X + " is " + result);
    }
}
