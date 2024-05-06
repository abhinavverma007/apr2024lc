class Solution {
// https://leetcode.com/submissions/detail/1250528638/
    static int[] dp = new int[38];
    public int tribonacci(int n) {
        if(n==0) {
            dp[0]=0;
            return 0;
        }
        if(n==1){
            dp[1]=1;
            return 1;
        }
        if(n==2){
            dp[2]=1;
            return 1;
        }
        if(dp[n]!=0) {
            return dp[n];
        }
        dp[n] = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return dp[n];
        
    }
}
