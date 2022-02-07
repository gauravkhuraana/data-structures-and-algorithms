package knapsack.unbounded;

public class rodCutting {

    public static int maxProfitForCutting(int[] cut, int Val[],int l)
    {
        int cutArLen=cut.length;

        int[][] t = new int[cutArLen+1][l+1];

        // intialisaing with 0
        // for no values available it will be 0
        // for no cut available it will be 0
        for (int i = 0; i < cutArLen+1; i++) {
            for (int j = 0; j < l+1; j++) {
                if(i==0 || j==0)
                {
                    t[i][j]=0;
                }
             }
       }

        for (int i = 1; i < cutArLen+1; i++) {
            for (int j = 1; j < l+1; j++) {

                if(cut[i-1]<=j)
                {
                    t[i][j]=Math.max(Val[i-1]+ t[i][j-cut[i-1]],t[i-1][j]);
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }


        }








        // to be updated

        return t[cutArLen][l];
    }
}
