package Arrays;

import com.sun.xml.internal.ws.policy.AssertionSet;

public class removeRepeatingElementInArray {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        int count=0;
        int counter=0;
        for(int i=0;i<nums.length;i++)
        {

            j=i;
            while(nums[i]==val && i <nums.length-1) {
                counter++;
                i++;
            }


            if(nums[j]==val)
            {

                while(j<nums.length-2)
                {
                     nums[j] = nums[j+counter];
                     j++;

                }

                count++;
                counter=0;
            }
        }
        System.out.println(nums);
       return nums.length-count;
    }

    public static int removeElement_optimised(int[] nums, int val) {
        int begin=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[begin]=nums[i];
                begin++;
            }
        }
        return begin;

    }

    public static void main(String[] args) {

        int n=removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println(n);

        n=removeElement(new int[]{3,2,2,3}, 3);
        System.out.println(n);

        n=removeElement(new int[]{3,3}, 3);
        System.out.println(n);



    }

}
