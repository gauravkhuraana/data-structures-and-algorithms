package knapsack_Testing;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class knapsackTestCases {

    @Test
    public static void test_RecursionMethod()
    {
        int[] WtAr={2,1,3,5};
        int W=7;
        int[] VAr={1,4,5,7};
        int n=WtAr.length;
        System.out.println("Testing knapsack if we are able to make Max profit ");

        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2,1,3,5},new int[]{10,11,12,9},7,4)).isEqualTo(33);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2,1,3,7},new int[]{10,10,10,30},7,4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2,1,3,7},new int[]{10,11,10,30},7,4)).isEqualTo(31);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2,4,3,7},new int[]{10,11,10,30},7,4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2,4,3,7},new int[]{1,1,1,1},7,4)).isEqualTo(2);

        // Checking when the value are 0
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{0,0,0,0},new int[]{1,1,1,1},7,4)).isEqualTo(4);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_memoization(new int[]{2,4,3,7},new int[]{0,0,0,0},7,4)).isEqualTo(0);

        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2,1,3,5},new int[]{10,11,12,9},7,4)).isEqualTo(33);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2,1,3,7},new int[]{10,10,10,30},7,4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2,1,3,7},new int[]{10,11,10,30},7,4)).isEqualTo(31);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2,4,3,7},new int[]{10,11,10,30},7,4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack_bottomUpApproach(new int[]{2,4,3,7},new int[]{1,1,1,1},7,4)).isEqualTo(2);

        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2,1,3,5},new int[]{10,11,12,9},7,4)).isEqualTo(33);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2,1,3,7},new int[]{10,10,10,30},7,4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2,1,3,7},new int[]{10,11,10,30},7,4)).isEqualTo(31);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2,4,3,7},new int[]{10,11,10,30},7,4)).isEqualTo(30);
        Assertions.assertThat(knapsack.knapsackSolution.knapsack(new int[]{2,4,3,7},new int[]{1,1,1,1},7,4)).isEqualTo(2);
    }

}
