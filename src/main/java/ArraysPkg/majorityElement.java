package ArraysPkg;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {


    //https://leetcode.com/problems/majority-element/

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);

            } else {
                hm.put(nums[i], 0);
            }

        }
        int max=0;
        int value = 0;
        for (Map.Entry me : hm.entrySet()) {
            if(max==0)
            {
            max=(int)me.getValue();
            }
            if (max < (int) me.getValue()) {
                max = (int) me.getValue();
                value = (int) me.getKey();
            }
        }

        return value;

    }

    public static int majorityElement_better(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap();
        int max=0, value=0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);

                if (max < (int) hm.get(nums[i]))
                {
                    max = (int) hm.get(nums[i]);
                    value = (int) hm.get(nums[i]);
                }
            }
             else {
                hm.put(nums[i], 1);

            }

        }


        return value;

    }

    public static int majorityElement_Optimised(int[] num) {

      int major =num[0];
      int count=1;
      for(int i=1;i<num.length;i++)
      {
          if(count==0)
          {
              major=num[i];
              count++;

          }
          else if(major==num[i])
          {
              count++;
          }
          else
          {
              count--;
          }
      }
        return major;
    }

    public static void main(String[] args) {

        int n = majorityElement_Optimised(new int[]{2, 1, 2, 2, 3,  4, 2});
        System.out.println(n);

        majorityElement_Optimised(new int[]{3, 2, 3});
        System.out.println(n);

        n = majorityElement_Optimised(new int[]{1});
        System.out.println(n);

    }
}