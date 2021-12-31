package Arrays;

import java.util.HashMap;
import java.util.Map;

public class sumTwoNumbers_EqualsTarget {


        public static int[] twoSum(int[] nums, int target) {

        int[] a=new int[2];
        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        for(int i=0; i <nums.length ;i++)
        {
            for(int j=i+1 ; j<nums.length;j++)
            {
                    if(nums[i]+nums[j]==target)
                    {
                       // System.out.println(i+j);
                        a[0]=i;
                        a[1]=j;
                        return a;
                    }

            }
        }
        return a;
    }


    // IN this method we check if the
    public static int[] twoSum_optimised(int[] nums, int target) {


        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i <nums.length ;i++)
        {

            if(map.containsKey(target-nums[i]))
            {
                return new int[]{i,map.get(target-nums[i])};
            }
            else
            {
                map.put(nums[i],i);
            }

        }
        return new int[2];
    }



 }


