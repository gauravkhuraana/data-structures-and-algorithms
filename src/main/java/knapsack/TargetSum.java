package knapsack;

import java.util.Arrays;
import knapsack.subset;
public class TargetSum {

    public static int countOfTargetSum(int[] ar, int tarSum)
    {

        System.out.println(" ------------------------------------------------------ ");
        System.out.println("The initial array is "+ Arrays.toString(ar));
        int sum = Arrays.stream(ar).sum();
        System.out.println("The sum of array is "+sum);
        System.out.println("The target sum we have to find is "+tarSum);

        System.out.println("We have to find a partition which has ( sum + tarSum ) / 2 = "+ (sum+tarSum)/2);

        int count = countOfSubsetSum.countOfSubSetSum(ar,(sum+tarSum)/2);

        System.out.println("These partition can be achieved in --> " + count + " number of ways ");


        // need to be updated
        return count;
    }
}
