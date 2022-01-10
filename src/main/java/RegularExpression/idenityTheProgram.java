package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class idenityTheProgram {

    public static boolean isValidInput(String input)
    {
        //to check if the IP address is within 0.0.0.0 to 255.255.255.255
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

//        0 1 10 99

        // 000..099
//        100....  199
//        200 219 229 249
//        250 251 255
//
//
//        099
//        199
//        1
//        10
//        99


        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        Pattern p = Pattern.compile(regex);
        if (input == null) {
            return false;
        }
        Matcher m = p.matcher(input);
        return m.matches();
    }
}
