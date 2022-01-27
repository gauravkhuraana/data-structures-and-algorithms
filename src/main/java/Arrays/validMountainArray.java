package Arrays;

public class validMountainArray {

    public static boolean validMountainArray(int[] arr) {
        boolean mountainArray = false;

        if (arr.length < 3) {
            System.out.println("Length should be atleast 3 but we got the length as "+arr.length);
            return mountainArray;
        }

        int max=arr[0];
        int min=0;
        int ascendingCount=0;
        int descendingCount=0;
        for(int i=1;i<arr.length ; i++)
        {
            // considering first 2 numbers are in ascending order

            if(arr[i]>max && descendingCount==0)
            {
              max=arr[i];
              ascendingCount++;
              continue;
            }

            //if any number is equal to previous while ascending exit
            if(arr[i]==max )
            {
                return false;
            }

            // If you reached here its time to do the descending

            else if(ascendingCount>0 && descendingCount==0)
            {
                min=arr[i];
                mountainArray=true;
                descendingCount++;
                continue;
            }

            // now only descending should happen
            if(arr[i]<min && ascendingCount >0 )
            {
                min=arr[i];
                descendingCount++;
                mountainArray=true;
                continue;

            }
            //  if there is any equality or a greater number while we are desceding we can exit
            else
            {
                return false;
            }
        }

        return mountainArray;
    }

    public static boolean validMountainArray_optimised(int[] arr) {

        int n=arr.length;
        int i=0;

        // Take i till the point where its ascending only
        while(i<n-1 && arr[i]<arr[i+1])
            i++;

        if(i==0 || i==n-1 || arr[i]==arr[i+1])
            return false;

        // now it should reach till the last position while descending
        while(i<n-1 && arr[i]>arr[i+1])
            i++;

        return i==n-1;


    }
}
