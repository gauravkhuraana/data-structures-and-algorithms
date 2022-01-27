package regularExpression;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class regularExpressionTest {

    @Test
    public static void test_IPAddress()
    {
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("192.192.192.192")).isTrue();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("0.0.0.0")).isTrue();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("255.255.255.255")).isTrue();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("10.0.0.255")).isTrue();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("02.092.000.0")).isTrue();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1.1.1")).isTrue();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1.1.1")).isTrue();



        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("-1.1.1.1")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1.1.256")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1.256.255")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.256.1.2")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1.1.")).isFalse();

        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("0...")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("900.1.1.1")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("255.255.255.2555")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1..1.200")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1..200")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1.1.")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("2011200")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("201.120.0")).isFalse();
        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("1.1")).isFalse();

        Assertions.assertThat(RegularExpression.idenityTheProgram.isValidInput("201.120.0")).isFalse();

    }

}
