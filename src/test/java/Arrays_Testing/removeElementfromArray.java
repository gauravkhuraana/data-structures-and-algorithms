package Arrays_Testing;
import Arrays.*;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class removeElementfromArray {

    @Test
    public static void removeDuplicatesTest()
    {
        Assertions.assertThat(Arrays.removeRepeatingElementInArray
                .removeElement_optimised(new int[]{1,1,2},1)).isEqualTo(1);
        Assertions.assertThat(Arrays.removeRepeatingElementInArray
                .removeElement_optimised(new int[]{1,1},1)).isEqualTo(0);
        Assertions.assertThat(Arrays.removeRepeatingElementInArray
                .removeElement_optimised(new int[]{1,1,2,2,2},2)).isEqualTo(2);
        Assertions.assertThat(Arrays.removeRepeatingElementInArray
                .removeElement_optimised(new int[]{1,-1,2,-1,3},-1)).isEqualTo(3);
        Assertions.assertThat(Arrays.removeRepeatingElementInArray
                .removeElement_optimised(new int[]{1,2,3,4},0)).isEqualTo(4);
        Assertions.assertThat(Arrays.removeRepeatingElementInArray
                .removeElement_optimised(new int[]{3,4,2,1},0)).isEqualTo(4);

        Assertions.assertThat(Arrays.removeRepeatingElementInArray
                .removeElement_optimised(new int[]{1},1)).isEqualTo(0);


    }
}
