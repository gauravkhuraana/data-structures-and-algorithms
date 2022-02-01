package knapsack;


import java.util.Arrays;

public class countOfSubsetWithGivenDifference {

    public static int countOfSetWithDifference(int[] ar, int diff)
    {
        System.out.println(" ------------------------------------------------------ ");
        System.out.println("The initial array is "+Arrays.toString(ar));
        int sum = Arrays.stream(ar).sum();
        System.out.println("The sum of array is "+sum);
        System.out.println("The difference we have to find is "+diff);

        System.out.println("The subset we have to find are (diff+sum)/2 = " + (diff+sum)/2);

        // with above formula we can know what would be the subset sum which can produce that difference

        // now we know the sum, we can know how many subsets can be formed for that sum
        int count=countOfSubsetSum.countOfSubSetSum(ar,(diff+sum)/2);
        System.out.println("The number of subsets which can result in sum as "+ (diff+sum)/2 +" are "+  count);
        System.out.println(" ------------------------------------------------------ ");

        return count;


    }
}

