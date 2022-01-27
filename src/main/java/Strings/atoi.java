package Strings;

import static java.lang.Character.isDigit;
import static java.lang.Math.pow;

public class atoi {
    public static int myAtoi(String s) {

        // Remove leading spaces
        String trim=s.trim();

        // Convert String to Char Array
        char[] ch= new char[s.length()];
        ch=s.toCharArray();
        int sign=1;
        int finalnumber=0;
        for(int i=0;i<ch.length;i++) {
            if (ch[i] == '-') {
                sign = -1;
                continue;
            }

            if (Character.isAlphabetic(ch[i]))
                break;
            if (Character.isWhitespace(ch[i]))
                continue;

            if (isDigit(ch[i]))

                while(i<ch.length)
                {

                    if(sign * finalnumber< -1 *pow(2,31))
                        return (int) ((-1)*pow(2,31));
                    if(sign * finalnumber > pow(2,31))
                        return (int) pow(2,31);

                    if (!isDigit(ch[i]))
                        return finalnumber*sign;
                    finalnumber = finalnumber * 10 + Character.getNumericValue(ch[i]);
                    if((finalnumber-Character.getNumericValue(ch[i]))/10==finalnumber )
                    i++;


                }
            }



        return finalnumber*sign;

        }


    public static int myAtoi_optimised(String s) {

        int index=0;
        int len=s.length();
        int sign=1;
        int result=0;

        while(index<len && s.charAt(index)==' ')
        {
            index++;
        }
        if(index<len && s.charAt(index)=='+')
        {
            sign=1;
            index++;
        }
        else if(index<len && s.charAt(index)=='-')
        {
            sign=-1;
            index++;
        }

        while(index<len && isDigit(s.charAt(index)))
        {
            int digit = s.charAt(index) - '0';


            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10 ))

            {
                System.out.println("Overflow happened");
                return (sign==1? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
            result=result*10+digit;

            index++;


        }

        return sign*result;
    }
    }

