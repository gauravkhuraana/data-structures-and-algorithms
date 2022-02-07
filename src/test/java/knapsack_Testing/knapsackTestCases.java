package knapsack_Testing;

import knapsack.TargetSum;
import knapsack.countOfSubsetSum;

import knapsack.minimumSubSetSumDifference;
import knapsack.countOfSubsetWithGivenDifference;
import knapsack.unbounded.coinChange_maxNumberOfWays;
import knapsack.unbounded.coinChange_minimumNbrOfCoins;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;


public class knapsackTestCases {


    @Test
    public static void test_countOfTargetSum() {

        System.out.println(" Testing how many ways can produce a target sum");
        Assertions.assertThat(TargetSum.countOfTargetSum(new int[]{1, 1, 3, 4}, 1)).isEqualTo(3);
        Assertions.assertThat(TargetSum.countOfTargetSum(new int[]{1, 2, 3, 4}, 0)).isEqualTo(2);
        Assertions.assertThat(TargetSum.countOfTargetSum(new int[]{1, 2, 3}, 1)).isEqualTo(2);


    }


    @Test
    public static void test_countOfSubsetDifference() {

        System.out.println(" Testing how many pairs can produce a certain difference");
        Assertions.assertThat(countOfSubsetWithGivenDifference.countOfSetWithDifference(new int[]{1, 1, 3, 4}, 1)).isEqualTo(3);
        Assertions.assertThat(countOfSubsetWithGivenDifference.countOfSetWithDifference(new int[]{1, 2, 5, 4}, 1)).isEqualTo(2);

        Assertions.assertThat(countOfSubsetWithGivenDifference.countOfSetWithDifference(new int[]{2, 2, 7, 4}, 3)).isEqualTo(2);

        //(2,7) (2,4)


    }

    @Test
    // Range - 2(number of items)
    // number of items = Range/2
    public static void test_minimumSumDifference() {
        System.out.println("Testing if we are able to find the minimum Difference in a subset ");

        Assertions.assertThat(minimumSubSetSumDifference.minimumSumDifference(new int[]{1, 3, 5})).isEqualTo(1);
        Assertions.assertThat(minimumSubSetSumDifference.minimumSumDifference(new int[]{1, 3, 4, 5, 7})).isEqualTo(0);
        Assertions.assertThat(minimumSubSetSumDifference.minimumSumDifference(new int[]{5, 3, 4})).isEqualTo(2);

        //Assertions.assertThat(minimumSubSetSumDifference.minimumSumDifference(new int[]{})).isEqualTo(0);
        Assertions.assertThat(minimumSubSetSumDifference.minimumSumDifference(new int[]{1, 1})).isEqualTo(0);


    }

    @Test
    public static void test_countOfEqualParition() {
        System.out.println("Testing if we are able to find any subset  ");

        Assertions.assertThat(countOfSubsetSum.countOfSubSetSum(new int[]{}, 0)).isEqualTo(1);
        Assertions.assertThat(countOfSubsetSum.countOfSubSetSum(new int[]{1, 2}, 0)).isEqualTo(1);
        Assertions.assertThat(countOfSubsetSum.countOfSubSetSum(new int[]{1, 2, 3}, 0)).isEqualTo(1);
        Assertions.assertThat(countOfSubsetSum.countOfSubSetSum(new int[]{}, 3)).isEqualTo(0);


        Assertions.assertThat(countOfSubsetSum.countOfSubSetSum(new int[]{1, 1}, 1)).isEqualTo(2);
        Assertions.assertThat(countOfSubsetSum.countOfSubSetSum(new int[]{1, 1, 2, 2}, 2)).isEqualTo(3);
        Assertions.assertThat(countOfSubsetSum.countOfSubSetSum(new int[]{1, 1, 1, 2, 2}, 3)).isEqualTo(7);


    }

    @Test
    public static void test_isEqualParition() {
        System.out.println("Testing if we are able to find any subset  ");

        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{})).isTrue();

        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{2, 1, 3, 6})).isTrue();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{0, 0, 0, 0})).isTrue();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1, 1, 1, 1})).isTrue();
        //Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{-1,-1,-1,-1})).isTrue();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1})).isFalse();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1, 1})).isTrue();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{100, 200, 300})).isTrue();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1000, 800, 200})).isTrue();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1000, 800, 200, 0})).isTrue();
        //Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1000,800,100,-100})).isTrue();

        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1000, 800, 100, 150, 4})).isFalse();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1, 2, 3, 4, 5})).isFalse();
        Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1, 2, 3, 4, 6})).isTrue();
        //Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1000,800,200,153,-153})).isTrue();
        //Assertions.assertThat(knapsack.equalPartition.equalParition(new int[]{1000,800,100,-100})).isTrue();


    }

    @Test
    public static void test_RecursionMethod() {
        int[] WtAr = {2, 1, 3, 5};
        int W = 7;
        int[] VAr = {1, 4, 5, 7};
        int n = WtAr.length;
        System.out.println("Testing knapsack if we are able to make Max profit ");

        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2, 1, 3, 5}, new int[]{10, 11, 12, 9}, 7, 4)).isEqualTo(33);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2, 1, 3, 7}, new int[]{10, 10, 10, 30}, 7, 4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2, 1, 3, 7}, new int[]{10, 11, 10, 30}, 7, 4)).isEqualTo(31);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2, 4, 3, 7}, new int[]{10, 11, 10, 30}, 7, 4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2, 4, 3, 7}, new int[]{1, 1, 1, 1}, 7, 4)).isEqualTo(2);

        // Checking when the value are 0
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{0, 0, 0, 0}, new int[]{1, 1, 1, 1}, 7, 4)).isEqualTo(4);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2, 4, 3, 7}, new int[]{0, 0, 0, 0}, 7, 4)).isEqualTo(0);

        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2, 1, 3, 5}, new int[]{10, 11, 12, 9}, 7, 4)).isEqualTo(33);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2, 1, 3, 7}, new int[]{10, 10, 10, 30}, 7, 4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2, 1, 3, 7}, new int[]{10, 11, 10, 30}, 7, 4)).isEqualTo(31);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2, 4, 3, 7}, new int[]{10, 11, 10, 30}, 7, 4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2, 4, 3, 7}, new int[]{1, 1, 1, 1}, 7, 4)).isEqualTo(2);

        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2, 1, 3, 5}, new int[]{10, 11, 12, 9}, 7, 4)).isEqualTo(33);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2, 1, 3, 7}, new int[]{10, 10, 10, 30}, 7, 4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2, 1, 3, 7}, new int[]{10, 11, 10, 30}, 7, 4)).isEqualTo(31);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2, 4, 3, 7}, new int[]{10, 11, 10, 30}, 7, 4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2, 4, 3, 7}, new int[]{1, 1, 1, 1}, 7, 4)).isEqualTo(2);
    }

    @Test
    public static void test_subsetPresence() {
        System.out.println("Testing if we are able to find any subset  ");

        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{2, 1, 3, 5}, 6, 4)).isTrue();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{2, 1}, 3, 2)).isTrue();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{10}, 10, 1)).isTrue();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{1, 2, 3, 4}, 5, 4)).isTrue();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{4, 3, 2, 1, 0}, 1, 5)).isTrue();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{10, 9, 1, 2, 3, 6}, 9, 6)).isTrue();

        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{2, 1}, 4, 2)).isFalse();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{2, 1, 0}, 5, 2)).isFalse();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{10}, 9, 1)).isFalse();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{1, 2, 3, 4}, 11, 4)).isFalse();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{4, 3, 2, 1, 0}, 19, 5)).isFalse();
        Assertions.assertThat(knapsack.subset.subsetPresence(new int[]{10, 9, 1, 2, 3, 6}, 55, 6)).isFalse();


    }

    @Test
    public static void test_minNbrOfCoinsToFormTheSum() {
        System.out.println("Testing to check to get the maximum number of ways to achieve a sum ");

        Assertions.assertThat(coinChange_minimumNbrOfCoins.minNbrOfCoinsToFormTheSum(new int[]{1,3,5},4,3)).isEqualTo(2);
        Assertions.assertThat(coinChange_minimumNbrOfCoins.minNbrOfCoinsToFormTheSum(new int[]{1,3,5},5,3)).isEqualTo(1);
        Assertions.assertThat(coinChange_minimumNbrOfCoins.minNbrOfCoinsToFormTheSum(new int[]{1,3,5},2,3)).isEqualTo(2);
        Assertions.assertThat(coinChange_minimumNbrOfCoins.minNbrOfCoinsToFormTheSum(new int[]{1,3,5},6,3)).isEqualTo(2);
        Assertions.assertThat(coinChange_minimumNbrOfCoins.minNbrOfCoinsToFormTheSum(new int[]{1,2,3,5},3,3)).isEqualTo(1);

        //Assertions.assertThat(coinChange_minimumNbrOfCoins.minNbrOfCoinsToFormTheSum(new int[]{},3,0)).isEqualTo(0);
        Assertions.assertThat(coinChange_minimumNbrOfCoins.minNbrOfCoinsToFormTheSum(new int[]{1,2,3,5},0,3)).isEqualTo(0);

    }
        @Test
    public static void test_numberOfWaysToGetTheCoinSum() {
        System.out.println("Testing to check to get the maximum number of ways to achieve a sum ");

        Assertions.assertThat(coinChange_maxNumberOfWays.numberOfWaysToGetTheCoinSum(new int[]{1,2,3},5,3)).isEqualTo(5);
        Assertions.assertThat(coinChange_maxNumberOfWays.numberOfWaysToGetTheCoinSum(new int[]{1,2,3},0,3)).isEqualTo(1);
        Assertions.assertThat(coinChange_maxNumberOfWays.numberOfWaysToGetTheCoinSum(new int[]{},1,0)).isEqualTo(0);
        Assertions.assertThat(coinChange_maxNumberOfWays.numberOfWaysToGetTheCoinSum(new int[]{},5,0)).isEqualTo(0);


    }
        @Test
    public static void test_maxProfitForCutting() {
        System.out.println("Testing to check if we should get the maximum profit by cutting a rod  ");

        Assertions.assertThat(knapsack.unbounded.rodCutting.maxProfitForCutting(new int[]{1,2,3},new int[]{1,2,3},0)).isEqualTo(0);
      //  Assertions.assertThat(knapsack.unbounded.rodCutting.maxProfitForCutting(new int[]{1,2,3},new int[]{},5)).isEqualTo(0);
        Assertions.assertThat(knapsack.unbounded.rodCutting.maxProfitForCutting(new int[]{},new int[]{1,2,3},5)).isEqualTo(0);

        Assertions.assertThat(knapsack.unbounded.rodCutting.maxProfitForCutting(new int[]{1,2,3},new int[]{10,2,3},3)).isEqualTo(30);
        Assertions.assertThat(knapsack.unbounded.rodCutting.maxProfitForCutting(new int[]{1},new int[]{50},2)).isEqualTo(100);
        Assertions.assertThat(knapsack.unbounded.rodCutting.maxProfitForCutting(new int[]{4,5,6},new int[]{1,3,4},12)).isEqualTo(8);
        Assertions.assertThat(knapsack.unbounded.rodCutting.maxProfitForCutting(new int[]{1,3,5},new int[]{1,6,7},5)).isEqualTo(8);


    }

}
