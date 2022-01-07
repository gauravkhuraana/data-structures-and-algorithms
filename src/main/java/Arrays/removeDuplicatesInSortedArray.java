package Arrays;

public class removeDuplicatesInSortedArray {


        public static int removeDuplicates(int[] nums) {

            int j=0;


            for(int i=0; i < nums.length; i++)
            {
                int value=nums[j];
                while(i <nums.length && value==nums[i] )
                {
                    nums[j]=nums[i];
                    i++;

                }

                if(i <nums.length && value!=nums[i])
                {



                    j=j+1;
                    nums[j]=nums[i];
                    value=nums[j];


                }

            }

            return j+1;

        }

        public static int removeDuplicatesoOptimised(int[] nums) {

           int counterOfDuplicates=0;

           for(int i =1;i<nums.length;i++)
           {
               if(nums[i]==nums[i-1])
                   counterOfDuplicates++;
               else
                   nums[i-counterOfDuplicates]=nums[i];
           }

            return nums.length-counterOfDuplicates;
        }

}
