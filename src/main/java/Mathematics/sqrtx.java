package Mathematics;

public class sqrtx {

    public static int mySqrt__second(int x) {

        int number=1;
        int count=0;
        while(x>0)
        {
            x=x-number;
            number=number+2;
            count++;
        }
        return count;
    }

    public static int mySqrt_third(int x) {

        // Checking if we multiply the number with the same number
        // 1*1 <=1
        // 2*2 <=2 3*3 <=9 4*4 <=16
        long  number=1;
        int count=0;
        while(number*number<=x)
        {
            number++;
        }
        return (int) (number-1);
    }


    public static int mySqrt_third(long x) {


        if(x==0)
            return 0;

        long end=x;
        long start=1;

        while(start<end) {
            long mid = (int)start + (int)(end - start) / 2;

            if (mid * mid <= x && (mid + 1) * (mid + 1) > (x))
                return (int)mid;
            else if (mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid < x) {
                start = mid + 1;
            }
        }
        return (int)start;







        }

    public static void main(String[] args)
    {
        int num=mySqrt_third(2147395600);
        //46340
        System.out.println(num);
        num=mySqrt_third(4);
        System.out.println(num);
        num=mySqrt_third(9);
        System.out.println(num);
        num=mySqrt__second(144);
        System.out.println(num);
        num=mySqrt_third(361);
        System.out.println(num);
        num=mySqrt_third(151);
        System.out.println(num);
        num=mySqrt_third(1);
        System.out.println(num);
    }
}
