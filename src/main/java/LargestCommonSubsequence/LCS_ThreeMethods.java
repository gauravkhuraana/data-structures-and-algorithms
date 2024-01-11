package LargestCommonSubsequence;

import java.util.Arrays;

public class LCS_ThreeMethods {


    public static int LCS_recursion(String x, String y, int n, int m)
    {
        char[] Xch = x.toCharArray();
        char[] Ych = y.toCharArray();

        if(n==0 || m==0)
            return 0;

        if(Xch[n-1]==Ych[m-1])
            return 1+LCS_recursion(x,y,n-1,m-1);
        else
            return Math.max(LCS_recursion(x, y, n-1, m),LCS_recursion(x,y,n,m-1));

    }


    public static int LCS_memoization(String x, String y, int n,int m,int[][]t)
    {
        char[] Xch=x.toCharArray() ;
        char[] Ych=y.toCharArray() ;


        if(n==0 || m==0)
            return 0;

        if(t[n][m]!=0)
            return t[n][m];

        if(Xch[n-1]==Ych[m-1])
            return t[n][m]=1+LCS_memoization(x,y,n-1,m-1,t);
        else
            return t[n][m]=Math.max(LCS_memoization(x,y,n-1,m,t),LCS_memoization(x,y,n,m-1,t));

    }

    public static int LCS_bottomUp(String x, String y, int n,int m) {
        char[] Xch = x.toCharArray();
        char[] Ych = y.toCharArray();

        int t[][]=new int[n+1][m+1];

        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0 || j==0)
                    t[i][j]=0;

            }

        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
              if(Xch[i-1]==Ych[j-1])
                  t[i][j]=1+t[i-1][j-1];
              else
                  t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
           }
        }
        return t[n][m];
    }
}
