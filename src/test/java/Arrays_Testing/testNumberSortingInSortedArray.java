package Arrays_Testing;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class testNumberSortingInSortedArray {

    @Test
    public static void removeDuplicatesTest()
    {
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[]{1,1,2})).isEqualTo(2);
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[]{1,1,2,2,3,3,3,4,4,5})).isEqualTo(5);
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[]{1})).isEqualTo(1);
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[1])).isEqualTo(1);
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[]{1,1,1,1,1})).isEqualTo(1);
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[]{-5,-4,-3,-2,-1})).isEqualTo(5);
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[]{0,0,0,0,0})).isEqualTo(1);
        Assertions.assertThat(Arrays.removeDuplicatesInSortedArray
                .removeDuplicatesoOptimised(new int[]{-10,-10,-10,-10,-10})).isEqualTo(1);
    }

}
