package Recursion;

/**
 * Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }
 *
 * Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
 */
public class R2Print1ToNAlternate {
    static void func(int i, int n){

        // Base Condition.
        if (i<1)
            return;

        // Function call to print(n-1) integers.
        func(i-1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        // Here, let’s take the value of n to be 4.
        int n = 4;
        func(n,n);
    }
}
