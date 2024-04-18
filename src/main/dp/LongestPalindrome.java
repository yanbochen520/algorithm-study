package main.dp;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        Boolean[][] dp = new Boolean[s.length()][s.length()];
        char[] chs = s.toCharArray();
        int start=0,end=0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(chs, dp, i, j) && j - i + 1 > max) {
                    max = j - i + 1;
                    start= i;
                    end =j;
                }
            }
        }
        return s.substring(start,end+1);
    }

    public boolean isPalindrome(char[] chs, Boolean[][] dp, int start, int end) {
        if (chs == null) return false;
        if (start >= end) return true;
        if (dp[start][end] != null) return dp[start][end];
        dp[start][end] = chs[start] == chs[end] && isPalindrome(chs, dp, start + 1, end - 1);
        return dp[start][end];

    }

    public static class RegularExpMatch {
        //
    }
}
