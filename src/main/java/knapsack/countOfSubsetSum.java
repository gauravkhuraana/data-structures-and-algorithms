package knapsack;

public class countOfSubsetSum {

    public static int countOfSubSetSum(int[] wtAr, int sum)
    {
        int numberOfEqualParition=0;
        return numberOfEqualParition=numberofEqualPartition(wtAr,sum,wtAr.length);



    }
    private static int numberofEqualPartition(int[] wtAr,int sum,int n)
    {
        int [][] t = new int[n+1][sum+1];
        for(int i=0;i<n+1;i++)
            for(int j=0;j<sum+1;j++) {
                if (i == 0)
                    t[i][j] = 0;
                if (j == 0)
                    t[i][j] = 1;
            }

        for(int i=1;i<n+1;i++)
            for(int j=1;j<sum+1;j++)
            {
                if(wtAr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-wtAr[i-1]] + t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }

        return t[n][sum];
    }

}
