package Recursion;

/***
 * Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }
 *
 * Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
 */
public class R1PrintNameNTimes {
    static int cnt = 0;
    static void print(int n){

        // Base Condition.
        if(cnt == n )
            return;

        // print name if Base Condition is false
        System.out.println("Sanj");

        // Count incremented.
        cnt = cnt+1;
        print(n);

    }
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
}
