package knapsack.unbounded;

public class coinChange_maxNumberOfWays {

    public static int numberOfWaysToGetTheCoinSum(int[] wtAr,int sum, int n)
    {
        int [][]t=new int[wtAr.length+1][sum+1];

        for (int i = 0; i <wtAr.length+1 ; i++) {
            for (int j = 0; j <sum+1 ; j++) {
                if(i==0)
                {
                    t[i][j]=0;
                }
                if(j==0)
                {
                    t[i][j]=1;
                }
            }

        }

        for (int i = 1; i <wtAr.length+1 ; i++) {
            for (int j = 1; j <sum+1 ; j++) {
                if(wtAr[i-1]<=j)
                {
                    t[i][j]=t[i][j-wtAr[i-1]] + t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }

            }

        }
        return t[wtAr.length][sum];
    }
}
