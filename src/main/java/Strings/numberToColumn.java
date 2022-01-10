package Strings;

public class numberToColumn {

    //https://leetcode.com/problems/excel-sheet-column-title/


    public static String convertToTitle(int columnNumber) {

        String sample = "";
        int dividend;
        int remainder = 0;

        dividend = columnNumber / 26;

        if (dividend > 0) {
            remainder = columnNumber % 26;
            //columnNumber=columnNumber/26;

            if (dividend > 0) {
                dividend = dividend + 64;
                sample = sample + (char) dividend;
            }


        }
        if (remainder == 0) {
            remainder = remainder + 65;
            sample = sample + (char) remainder;
            return sample;
        }
        remainder = remainder + 64;
        sample = sample + (char) remainder;

        return sample;

    }

    public static String convertToTitle_Optimised(int columnNumber) {



        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
        // Since A in excel is 1
        // and we have to start 0 to do base 26 calculations
            columnNumber--;
            int remainder = (columnNumber) % 26;

            //We go the reverse way by adding at front
            sb.insert(0,(char) (remainder + 'A'));

            columnNumber = columnNumber / 26;
        }

        return sb.toString();
    }


}
