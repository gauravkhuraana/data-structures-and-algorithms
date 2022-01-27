package Mathematics;

public class NumberOfOneBits {

    //https://leetcode.com/problems/number-of-1-bits/

    public static int hammingWeight(int n) {

        int count=0;

        // We are not using n>0 because Java does not have unsigned integer so negative number becomes positive

        while(n!=0)
        {
            // if we muliply something by 0000000000000001 it will result 1 only if last digis it 1
            count=count+ (n&1);
            n=n>>>1;
        }

        return count;
    }
}
