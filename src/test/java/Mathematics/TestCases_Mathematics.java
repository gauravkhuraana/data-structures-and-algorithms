package Mathematics;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class TestCases_Mathematics {


    @Test
    public static void test_NumberOfOnesBitInUnsignedInteger()
    {
        Assertions.assertThat(NumberOfOneBits.hammingWeight(3)).isEqualTo(2);
        Assertions.assertThat(NumberOfOneBits.hammingWeight(16)).isEqualTo(1);
        Assertions.assertThat(NumberOfOneBits.hammingWeight(-3)).isEqualTo(31);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(11000000000000000000000000)).isEqualTo(2);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(00010000000000000000000010)).isEqualTo(2);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(00110000000000000000000000)).isEqualTo(2);
//
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(000000000000000000000000000)).isEqualTo(0);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(100011000000000000000000001)).isEqualTo(4);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(111111111111111111111111111)).isEqualTo(32);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(100011111111111111111110001)).isEqualTo(26);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(111111110000000000000000000)).isEqualTo(8);
//        Assertions.assertThat(NumberOfOneBits.hammingWeight(100000000000000000000000001)).isEqualTo(2);

    }

    @Test
    public static void test_reverseOfInteger()
    {
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(15)).isEqualTo(51);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(150)).isEqualTo(51);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(1500)).isEqualTo(51);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(15000)).isEqualTo(51);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(10050)).isEqualTo(5001);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(144450)).isEqualTo(54441);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(99999)).isEqualTo(99999);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(100000)).isEqualTo(1);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(144450)).isEqualTo(54441);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(-121)).isEqualTo(-121);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(-1210)).isEqualTo(-121);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(2147483647)).isEqualTo(0);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(-2147483648)).isEqualTo(0);
        Assertions.assertThat(reverseInteger.reverseIntegerOptimised(1534236469)).isEqualTo(0);

    }

    @Test
    public static void test_isPalindrome()
    {
        Assertions.assertThat(palindromeNumber.isPalindrome(1)).isTrue();
        Assertions.assertThat(palindromeNumber.isPalindrome(2)).isTrue();
        Assertions.assertThat(palindromeNumber.isPalindrome(0)).isTrue();
        Assertions.assertThat(palindromeNumber.isPalindrome(1221)).isTrue();
        Assertions.assertThat(palindromeNumber.isPalindrome(1222221)).isTrue();

        // Negative one
        Assertions.assertThat(palindromeNumber.isPalindrome(-1)).isFalse();
        Assertions.assertThat(palindromeNumber.isPalindrome(-2)).isFalse();
        Assertions.assertThat(palindromeNumber.isPalindrome(-10)).isFalse();

        Assertions.assertThat(palindromeNumber.isPalindrome(12213)).isFalse();
        Assertions.assertThat(palindromeNumber.isPalindrome(1222222229)).isFalse();

        // Special case where it will cross the limit of integer
        Assertions.assertThat(palindromeNumber.isPalindrome(1999999991)).isTrue();
        Assertions.assertThat(palindromeNumber.isPalindrome(2147483647)).isFalse();



    }
    @Test
    public static void test_powerOfThree()
    {
        Assertions.assertThat(powerOfThree.isPowerOfThree(3)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree(-3)).isEqualTo(false);

        Assertions.assertThat(powerOfThree.isPowerOfThree(9)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree(27)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree(81)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree(243)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree(729)).isEqualTo(true);

        Assertions.assertThat(powerOfThree.isPowerOfThree(0)).isEqualTo(false);
        //1 is power of 3 raise to 0
        Assertions.assertThat(powerOfThree.isPowerOfThree(1)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree(2)).isEqualTo(false);
        Assertions.assertThat(powerOfThree.isPowerOfThree(4)).isEqualTo(false);
        Assertions.assertThat(powerOfThree.isPowerOfThree(100)).isEqualTo(false);

        Assertions.assertThat(powerOfThree.isPowerOfThree(2147483647)).isEqualTo(false);

        Assertions.assertThat(powerOfThree.isPowerOfThree(14348907)).isEqualTo(true);

        Assertions.assertThat(powerOfThree.isPowerOfThree(-2147483648)).isEqualTo(false);
        Assertions.assertThat(powerOfThree.isPowerOfThree(1534236469)).isEqualTo(false);

        /* Power of 3 testing with recursion function  */

        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(-3)).isEqualTo(false);

        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(9)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(27)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(81)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(243)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(729)).isEqualTo(true);

        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(0)).isEqualTo(false);
        //1 is power of 3 raise to 0
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(1)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(2)).isEqualTo(false);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(4)).isEqualTo(false);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(100)).isEqualTo(false);

        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(2147483647)).isEqualTo(false);

        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(14348907)).isEqualTo(true);

        //Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(-2147483648)).isEqualTo(false);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursion(1534236469)).isEqualTo(false);


        Assertions.assertThat(powerOfThree.isPowerOfThree_recursionOneLiner(81)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree_recursionOneLiner(243)).isEqualTo(true);
        Assertions.assertThat(powerOfThree.isPowerOfThree(729)).isEqualTo(true);

        Assertions.assertThat(powerOfThree.isPowerOfThree_recursionOneLiner(0)).isEqualTo(false);
        //1 is power of 3 raise to 0
        Assertions.assertThat(powerOfThree.isPowerOfThree(1)).isEqualTo(true);
    }
}
