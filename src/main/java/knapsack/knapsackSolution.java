package knapsack;
import java.util.Arrays;



public class knapsackSolution {

    // Only using recursion
    public static int knapsack(int[] WtAr, int[] ValAr, int W, int n )
    {
        // if the weight or number of items is 0, profit is 0
        // Since you cant add as no more weight is left
        // or there is no items to be added

        if(W==0||n==0)
            return 0;

        if(WtAr[n-1]>W)
        {
            knapsack(WtAr,ValAr,W,n-1);
        }
        else if(WtAr[n-1]<=W)
        {
            return  Math.max(ValAr[n-1]+knapsack(WtAr,ValAr,W-WtAr[n-1],n-1), knapsack(WtAr,ValAr,W,n-1));
        }
        return  knapsack(WtAr,ValAr,W,n-1);
    }

    // Do memoization on recursion
    public static int knapsack_memoization(int[] WtAr, int[] ValAr, int W, int n)
    {
        int t[][]=new int[n+1][W+1];

        // to fill the array with -1 value
        for(int[] temp:t)
            Arrays.fill(temp,-1);

        if(n==0||W==0)
          return 0;
        if(t[n][W]!=-1)
            return t[n][W];
        else if(WtAr[n-1]<=W)
            return t[n][W]=Math.max(ValAr[n-1]+knapsack_memoization(WtAr,ValAr,W-WtAr[n-1],n-1),knapsack_memoization(WtAr,ValAr,W,n-1));
        else if(WtAr[n-1] >W)
            return t[n][W]=knapsack_memoization(WtAr,ValAr,W,n-1);

        return t[n][W];
    }

    // Bottom Up Approach
    public static int knapsack_bottomUpApproach(int[] wtAr, int[] ValAr, int W,int len)
    {
        int[][] t= new int[len+1][W+1];

        for(int[] temp : t) {
            Arrays.fill(temp, 0);
        }

        for(int i=1;i<len+1;i++)
        {
            for(int j=1;j<W+1;j++)
            {
                if (wtAr[i-1]<=j)
                {
                    t[i][j]=Math.max(ValAr[i-1] + t[i-1][j-wtAr[i-1]] ,t[i-1][j]);
                }
                else
                    t[i][j]=t[i-1][j];

            }
        }
//        for(int i=0;i<len+1;i++)
//            for(int j=0;j<W+1;j++)
//                System.out.print(t[i][j] + " ");
//            System.out.println(" ");


        // return the last corner which will have the maximum profit value
        return t[len][W];
    }

}
