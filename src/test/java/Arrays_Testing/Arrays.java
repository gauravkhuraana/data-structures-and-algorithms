package Arrays_Testing;

import ArraysPkg.PresenceOfOneArrayElement;
import ArraysPkg.sumTwoNumbersEqualsTarget;
import ArraysPkg.validMountainArray;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class Arrays {

    @Test
    public static void testSequenceOfElementFromOneArrayToAnother()
    {

        Assertions.assertThat(PresenceOfOneArrayElement.sequenceOfElement(
                new int[]{2,7,11,15},new int[]{2,15})).isEqualTo(true);

        Assertions.assertThat(PresenceOfOneArrayElement.sequenceOfElement(
                new int[]{2,7,11,10,9,15},new int[]{15,9})).isEqualTo(false);

        Assertions.assertThat(PresenceOfOneArrayElement.sequenceOfElement(
                new int[]{7,11},new int[]{7})).isEqualTo(true);

        Assertions.assertThat(PresenceOfOneArrayElement.sequenceOfElement(
                new int[]{7,11},new int[]{7,11})).isEqualTo(true);

        Assertions.assertThat(PresenceOfOneArrayElement.sequenceOfElement(
                new int[]{7,11},new int[]{11,7})).isEqualTo(false);
    }

    @Test
    public static void test_isItValidMountainArray() {


        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{1,2,3,2,1})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{1,2,1})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20,30,40,10})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20,30,40,90,80})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{-2,1,-2})).isTrue();

        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20,19,18,17,16,15,14})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,9,8,7,6,5,4,3})).isFalse();


        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20,21})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20,20})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20,20,40,30,30})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,20,30,40,30,30})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray(new int[]{10,10,20,21,15,9})).isFalse();



        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{1,2,3,2,1})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{1,2,1})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20,30,40,10})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20,30,40,90,80})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{-2,1,-2})).isTrue();

        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20,19,18,17,16,15,14})).isTrue();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,9,8,7,6,5,4,3})).isFalse();


        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20,21})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20,20})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20,20,40,30,30})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,20,30,40,30,30})).isFalse();
        Assertions.assertThat(validMountainArray.validMountainArray_optimised(new int[]{10,10,20,21,15,9})).isFalse();
    }



    @Test
    public static void sumofTwoNumbers_equalThrid() {


        Assertions.
                assertThat(sumTwoNumbersEqualsTarget.twoSum(new int[]{2,7,11, 15}, 9)).isEqualTo(new int[]{0,1});

        Assertions.
                assertThat(sumTwoNumbersEqualsTarget.twoSum(new int[]{3,2,4}, 6)).isEqualTo(new int[]{1, 2});

        Assertions.
                assertThat(sumTwoNumbersEqualsTarget.twoSum(new int[]{3,3}, 6)).isEqualTo(new int[]{0, 1});


        // Calling Optimised Way
        Assertions.
                assertThat(sumTwoNumbersEqualsTarget.twoSum(new int[]{2,7,11, 15}, 9)).isEqualTo(new int[]{0,1});

        Assertions.
                assertThat(sumTwoNumbersEqualsTarget.twoSum(new int[]{3,2,4}, 6)).isEqualTo(new int[]{1, 2});

        Assertions.
                assertThat(sumTwoNumbersEqualsTarget.twoSum(new int[]{3,3}, 6)).isEqualTo(new int[]{0, 1});

    }

}
