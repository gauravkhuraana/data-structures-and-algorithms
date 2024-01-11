package LargestCommonSubsequence_Testing;

import LargestCommonSubsequence.LCS_ThreeMethods;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Arrays;

public class LCS_Test {

    @Test
    public void test_LCS_bottomUp()
    {

        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("abcdds","adfsfsdf",6,8)).isEqualTo(3);
        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("","adfsfsdf",0,8)).isEqualTo(0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("afdfdsf","",7,0)).isEqualTo(0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("abababab","aaa",8,3)).isEqualTo(3);

        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("ertrtttererz","zadfsfsdf",12,9)).isEqualTo(1);

        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("zzzzzzzaaaaaa","xxxxxyyyyyy",13,11)).isEqualTo(0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("zzzzzzzaaaaaa","az",13,2)).isEqualTo(1);
        Assertions.assertThat(LCS_ThreeMethods.LCS_bottomUp("zy","yz",2,2)).isEqualTo(1);

    }

    @Test
    public void test_LCS_memoization()
    {
        int[][] t = new int[1000][1000];

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("abcdds","adfsfsdf",6,8,t)).isEqualTo(3);

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("","adfsfsdf",0,8,t)).isEqualTo(0);

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("afdfdsf","",7,0,t)).isEqualTo(0);

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("abababab","aaa",8,3,t)).isEqualTo(3);

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("ertrtttererz","zadfsfsdf",12,9,t)).isEqualTo(1);

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("zzzzzzzaaaaaa","xxxxxyyyyyy",13,11,t)).isEqualTo(0);

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("zzzzzzzaaaaaa","az",13,2,t)).isEqualTo(1);

        for(int[] temp:t)
            Arrays.fill(temp,0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_memoization("zy","yz",2,2,t)).isEqualTo(1);

    }

    @Test
    public void test_LCS_recursion()
    {

        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("abcdds","adfsfsdf",6,8)).isEqualTo(3);
        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("","adfsfsdf",0,8)).isEqualTo(0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("afdfdsf","",7,0)).isEqualTo(0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("abababab","aaa",8,3)).isEqualTo(3);

        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("ertrtttererz","zadfsfsdf",12,9)).isEqualTo(1);

        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("zzzzzzzaaaaaa","xxxxxyyyyyy",13,11)).isEqualTo(0);
        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("zzzzzzzaaaaaa","az",13,2)).isEqualTo(1);
        Assertions.assertThat(LCS_ThreeMethods.LCS_recursion("zy","yz",2,2)).isEqualTo(1);

    }

}

