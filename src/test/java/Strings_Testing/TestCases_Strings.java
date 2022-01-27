package Strings_Testing;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class TestCases_Strings {

    @Test
    public static void atoi_Test()

    {
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("23323")).isEqualTo(23323);

        Assertions.assertThat(Strings.atoi.myAtoi_optimised("sfasfds 23323sfdsf sf")).isEqualTo(0);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("afsdfdsf-23323safsf3445")).isEqualTo(0);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("  23")).isEqualTo(23);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("- 3323-+")).isEqualTo(0);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("    +23")).isEqualTo(23);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("23 323")).isEqualTo(23);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("23-23")).isEqualTo(23);

        //another sign after one sign is considered as non-digit characte
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("+-23323")).isEqualTo(0);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("                  23323hello sachi is my friend23323andwhoseyours")).isEqualTo(23323);
        Assertions.assertThat(Strings.atoi.myAtoi_optimised("4193 with words")).isEqualTo(4193);

        Assertions.assertThat(Strings.atoi.myAtoi_optimised("-91283472332")).isEqualTo(-2147483648);



    }

}
