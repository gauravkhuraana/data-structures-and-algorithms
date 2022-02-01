package ArraysPkg;

public class binarySearchInAnArray {

           public static void main(String[] args)
           {
               int out=search1(new int[]{-1,0,3,5,9,12},0);
               System.out.println("Output is "+out);

           }

            public static int search(int[] nums, int target) {



                int end=nums.length;

                int half;
                int start=0;
                //int half=end/2;

                while(start<=end)
                {
                    System.out.println("Iteration");
                    half=(end-1)/2;
                    System.out.println("half " + half);

                    if( target==nums[half] )
                    {
                        return half;
                    }
                    if(start==end)
                    {
                        return -1;
                    }
                    else if(target < nums[half])
                    {
                        end=half-1;
                    }
                    else if(target > nums[half])
                    {
                        start=half+1;
                    }
                    System.out.println(start);
                    System.out.println(end);

                    //start=start+1;
                }
                return -1;
        }

    public static int search1(int[] nums, int target) {


//        int out=search1(new int[]{-1,0,3,5,9,12},0);

        int end=nums.length;

        int half;
        int start=0;
        //int half=end/2;

        while(start<=end) {
            half=start+  (end-start)/2;

            if(nums[half]==target)
            {
                return half;
            }
            else if(start==end)
            {
                return -1;
            }
            else if(nums[half]>target)
            {
                end=half-1;
            }
            else if(nums[half]<target)
            {
                start=half+1;
            }

        }
        return -1;
    }
    }

