package Arrays_Testing;

import Arrays.FindSingleNonRepeatingNumber;
import Arrays.removeRepeatingElementInArray;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class majorityElementTesting {

    @Test
    public static void nonRepeatingElementTest()
    {
        //            .singleNumber_optimised(new int[]{1, 1, 2})).isEqualTo(2);
        Assertions.assertThat(FindSingleNonRepeatingNumber
                .singleNumber_optimised(new int[]{1,1})).isEqualTo(0);
        Assertions.assertThat(FindSingleNonRepeatingNumber
                .singleNumber_optimised(new int[]{1,1,2,2,3})).isEqualTo(3);
        Assertions.assertThat(FindSingleNonRepeatingNumber
                .singleNumber_optimised(new int[]{2,-1,2,-1,3})).isEqualTo(3);
        Assertions.assertThat(FindSingleNonRepeatingNumber
                .singleNumber_optimised(new int[]{1,1,4,4})).isEqualTo(0);
        Assertions.assertThat(FindSingleNonRepeatingNumber
                .singleNumber_optimised(new int[]{11,11,123,123,5})).isEqualTo(5);



    }
}
