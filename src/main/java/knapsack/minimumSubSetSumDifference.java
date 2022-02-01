package knapsack;
import java.util.Arrays;

public class minimumSubSetSumDifference {

    public static int minimumSumDifference(int[] ar)
    {
        System.out.println("The Original Array is "+ Arrays.toString(ar));
        int sum= Arrays.stream(ar).sum();
        System.out.println("Sum/Range of Array is "+ sum);

        // calling subset function to get the last row of the matrix
        boolean [][]dp=subset(ar,sum/2,ar.length);

        // print to check if we are getting correct true false
        // multiDimensionalArray.printMatrix(dp);

        int min=-1;
        int minValue=0;

        // Now checking the last row where the value is true
        // Checking which value is the minimum

        for(int j=1;j<=sum/2;j++)
        {
            int calc=sum-2*j;
            if(dp[ar.length][j]==true)
            {
                if(min==-1) {
                    min = calc;
                }
                else if(calc<min)
                {
                    min=calc;
                }
                minValue=j;

            }
        }

        System.out.println("The minimum difference is "+ min);
        System.out.println("The Value at which difference is minimum is "+ minValue);
        System.out.println("So sum " +sum + " - 2 * "+minValue + " should have minimum value = "+min);
        System.out.println(" ------------------------------------------------------ ");

        return min;
    }
    private static boolean[][] subset(int[] wtAr, int sum, int n)
    {
        boolean[][] t= new boolean[n + 1][sum + 1];

        for(int i=0;i<n+1;i++)
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)
                    t[i][j]=false;
                if(j==0)
                    t[i][j]=true;

            }

        for(int i=1;i<n+1;i++)
            for(int j=1;j<sum+1;j++)
            {
                if(wtAr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-wtAr[i-1]] || t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }

        return t;
    }
}
