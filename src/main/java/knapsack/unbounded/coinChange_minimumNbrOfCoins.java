package knapsack.unbounded;


public class coinChange_minimumNbrOfCoins {

    public static int minNbrOfCoinsToFormTheSum(int coinAr[],int sum,int n)
    {
        int[][]t = new int[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j <sum+1 ; j++) {
                if(j==0)
                    t[i][j]=0;
                if(i==0)
                    t[i][j]=Integer.MAX_VALUE-1;
            }
        }

        for(int j=1;j<sum+1;j++)
        {
            if(j%coinAr[0]==0)
            {
               t[1][j]=j/coinAr[0]   ;
            }
            else
            {
                t[1][j]=Integer.MAX_VALUE-1;
            }

        }


        for (int i = 2; i < n+1; i++) {
            for (int j = 1; j <sum+1 ; j++) {
                if(coinAr[i-1]<=j)
                {
                    t[i][j]=Math.min(1+t[i][j-coinAr[i-1]],t[i-1][j]);
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }


        return t[n][sum];
    }
}
