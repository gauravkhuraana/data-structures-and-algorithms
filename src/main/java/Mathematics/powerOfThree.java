package Mathematics;

public class powerOfThree {

    public static boolean isPowerOfThree(int n) {

        // if 3^19 divides the number perfectly that means
        // its power of 3 than the number can perfectly divide
        // the highest number
       return ( n>0 && 1162261467%n==0);
    }

    public static boolean isPowerOfThree_recursion(int n) {

        if(n==1) {
            return true;

        }
        else if(n==0||n%3!=0)
        {
            return false;
        }
        else{
            return isPowerOfThree_recursion(n/3);
        }
    }

    public static boolean isPowerOfThree_recursionOneLiner(int n) {

        return n>0 && (n==1 || n%3==0 && isPowerOfThree_recursionOneLiner(n/3));
    }

    public static boolean isPowerOfThree_Brute(int n) {

        while(n!=0)
        {
            if(n==1)
                return true;
            int rem=n%3;
            if(rem!=0)
                return false;
            n=n/3;

        }

        return false;
    }
}
