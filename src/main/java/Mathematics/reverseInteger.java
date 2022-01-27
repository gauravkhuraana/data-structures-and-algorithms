package Mathematics;

public class reverseInteger {

    public static int reverseWithLong(int x) {

        long reverse=0;
        int b=1;
        int rem=1;
        int multiplier=1;

        if(x<0)
        {
            multiplier=-1;
            x=x*multiplier;
        }




        while(x>0)
        {
            rem=x%10;

            reverse=reverse*10+rem;
            if(reverse> Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                System.out.println("print 0");
                return 0;
            }
            x=x/10;


        }
        reverse=reverse*multiplier;

        //System.out.println(reverse);
        System.out.println((int)reverse);

        return (int)reverse;
    }

    public static int reverseIntegerOptimised(int x) {


        int result=0;
        while(x!=0)
        {
            int rem=x%10;
            int reverse=result*10+rem;

            if((reverse-rem)/10 != result) {
                System.out.println("print 0");
                return 0;
            }

            result=reverse;
            x=x/10;


        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args)
    {
        reverseIntegerOptimised(15);
        reverseIntegerOptimised(150);
        reverseIntegerOptimised(1500);
        reverseIntegerOptimised(15000);
        reverseIntegerOptimised(10050);
        reverseIntegerOptimised(144450);
        reverseIntegerOptimised(99999);
        reverseIntegerOptimised(100000);
        reverseIntegerOptimised(144450);

        reverseIntegerOptimised(-121);
        reverseIntegerOptimised(-1210);
        reverseIntegerOptimised(-1210);
        reverseIntegerOptimised(2147483647);
        reverseIntegerOptimised(-214748648);
        reverseIntegerOptimised(1534236469);
    }

}

