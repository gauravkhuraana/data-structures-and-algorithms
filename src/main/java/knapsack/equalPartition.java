package knapsack;


public class equalPartition {

     public static boolean equalParition(int wtAr[])
    {
        boolean isThereEqualParition=false;
        int sum=0;
        for(int i=0;i<wtAr.length;i++)
            sum=sum+wtAr[i];

        System.out.println("The Sum of the array is " + sum);


        System.out.printf("So equivalence can exist if its an even number");
        if(sum%2==0)
        {
            System.out.println("Now if there is sum of half exist, that means the rest is other half ");
            System.out.println("So we will check if half the subset exist ");
            isThereEqualParition=isThereASubset(wtAr,sum/2, wtAr.length);

        }
        else
        {
            System.out.println("There cannot be a equal parition as the sum of all elements is odd i.e. "+sum);
            isThereEqualParition=false;
        }
        return isThereEqualParition;
    }

    public static boolean isThereASubset(int[] wtAr,int sum,int n)
    {
        boolean[][] t = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++)
            for(int j=0;j<sum+1;j++) {
                if (i == 0) {
                    t[i][j] = false ;
                }
                if (j == 0)
                {
                    t[i][j]=true;
                }
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


        return t[n][sum];
    }
}
