/* count the number of ways to construct sum n by throwing the dice one or more times
*  print number of ways module 10^9 + 7
*  same numbers but in different permutations is considered another way */

package dynamicProgramming;

import java.util.*;

public class diceSum {

    static final int MOD = 1_000_000_007;
    static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(numberOfWays(n));
    }

    static long numberOfWays(int n) {

        if (dp == null) {
            dp = new long[n + 1];
            Arrays.fill(dp, -1);
        }

        if (n == 0)
            return 1;

        if (n < 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = 0;

        for (int i = 1; i <= 6; i++) {
            dp[n] = (dp[n] + numberOfWays(n - i)) % MOD;
        }

        return dp[n];
    }
}