package Mathematics;

public class palindromeNumber {

    public static boolean isPalindrome(int x) {

        boolean isPallindrome=false;
        int reverse=0;
        int result=0;
        int number=x;
        while(x>0)
        {
            int rem=x%10;
            reverse =result * 10 + rem;
            if((reverse-rem)/10 != result)
            {
                System.out.println("The reverse has crossed the limit for integer");
                return false;

            }
            result=reverse;
            x=x/10;


        }
        if(number==result)
            return true;

        return isPallindrome;
    }
}
