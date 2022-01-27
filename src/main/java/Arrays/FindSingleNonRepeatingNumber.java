package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSingleNonRepeatingNumber {

    //https://leetcode.com/problems/single-number/

    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
              hm.remove(nums[i]);

            }
            else
            {
                hm.put(nums[i],0);
            }

        }
        int num = 0;
        for(Map.Entry m: hm.entrySet())
        {
            num= (int) m.getKey();
        }
        return num;



    }

    public static int singleNumber_optimised(int[] nums) {

        int num=0;

        for(int i=0;i<nums.length;i++)
        {
            // XOR them so atlast only one is left out
            num = num ^ nums[i];
        }

        return num;

    }


}
