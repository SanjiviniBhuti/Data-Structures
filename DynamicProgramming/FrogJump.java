/**
 * Problem statement
 * There is a frog on the '1st' step of an 'N' stairs long staircase. The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ). If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair. Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.
 *
 * For Example
 * If the given ‘HEIGHT’ array is [10,20,30,10], the answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from 2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.
 *
 * Sample Input 1:
 * 2
 * 4
 * 10 20 30 10
 * 3
 * 10 50 10
 * Sample Output 1:
 * 20
 * 0
 * Explanation of sample input 1:
 * For the first test case,
 * The frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost).
 * Then a jump from the 2nd stair to the last stair (|10-20| = 10 energy lost).
 * So, the total energy lost is 20 which is the minimum.
 * Hence, the answer is 20.
 *
 * For the second test case:
 * The frog can jump from 1st stair to 3rd stair (|10-10| = 0 energy lost).
 * So, the total energy lost is 0 which is the minimum.
 * Hence, the answer is 0.
 */

import java.util.* ;
public class FrogJump {

    // using recursion
    static int f(int index, int heights[]){
        if(index == 0 ){
            return 0;
        }
        int fs = f(index-1, heights) + Math.abs(heights[index] - heights[index-1]);
        int ss = Integer.MAX_VALUE;
        if(index>1){
            ss = f(index-2, heights) + Math.abs(heights[index] - heights[index-2]);
        }
        return Math.min(fs, ss);
    }
    public static int frogJump(int n, int heights[]) {
        int ds[] = new int[n+1];
        Arrays.fill(ds, -1);
        return f(n-1, heights);
    }

    // Using dp array
    static int f1(int index, int heights[], int ds[]){
        if(index == 0 ){
            return 0;
        }
        if(ds[index] != -1) return ds[index];
        int fs = f1(index-1, heights, ds) + Math.abs(heights[index] - heights[index-1]);
        int ss = Integer.MAX_VALUE;
        if(index>1){
            ss = f1(index-2, heights, ds) + Math.abs(heights[index] - heights[index-2]);
        }
        return ds[index] = Math.min(fs, ss);
    }
    public static int frogJump1(int n, int heights[]) {
        int ds[] = new int[n+1];
        Arrays.fill(ds, -1);
        return f1(n-1, heights, ds);
    }

    // Tabulation
    public static int frogJump2(int n, int heights[]) {
        int dp[] = new int[n];
        Arrays.fill(dp, 0);
        for(int i=1 ; i<n ; i++) {
            int fs = dp[i-1] + + Math.abs(heights[i] - heights[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1){
                ss = dp[i-2] + + Math.abs(heights[i] - heights[i-2]);
            }
            dp[i] = Math.min(fs, ss);
        }
        return dp[n-1];
    }

    // Optimal
    public static int frogJump3(int n, int heights[]) {
        int prev = 0, prev2 = 0;
        for(int i=1 ; i<n ; i++) {
            int fs = prev + + Math.abs(heights[i] - heights[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1){
                ss = prev2 + Math.abs(heights[i] - heights[i-2]);
            }
            int curi = Math.min(fs, ss);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        System.out.println("Minimum energy lost = "+frogJump(heights.length, heights));
        System.out.println("Minimum energy lost = "+frogJump1(heights.length, heights));
        System.out.println("Minimum energy lost = "+frogJump2(heights.length, heights));
        System.out.println("Minimum energy lost = "+frogJump3(heights.length, heights));
    }
}
