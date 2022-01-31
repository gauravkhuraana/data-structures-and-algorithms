package knapsack;

public class subset {

    public static boolean subsetPresence(int[] wtAr,int sum, int n)
    {
        boolean [][] t = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++)
            for(int j=0;j<sum+1;j++)
            {
                if(j==0)
                    t[i][j]=true;
                else if(i==0)
                    t[i][j]=false;
            }
        for(int i=1;i<n+1;i++)
            for(int j=1;j<sum+1;j++) {
                if (wtAr[i-1] <=j) {
                    t[i][j] = t[i-1][j-wtAr[i-1]] || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }

                return t[n][sum];

    }

    //        for(int i=0;i<n+1;i++)
//            for(int j=0;j<sum+1;j++)
//                System.out.print(t[i][j]);
//            System.out.println(" ");

}
