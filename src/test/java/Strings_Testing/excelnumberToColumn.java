package Strings_Testing;


import Arrays.*;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;




        public class excelnumberToColumn {
@Test
public static void testNumberToColumnConvertor()

            {
                Assertions.
                        assertThat(Strings.numberToColumn.convertToTitle_Optimised(1)).isEqualTo("A");

                Assertions.
                        assertThat(Strings.numberToColumn.convertToTitle_Optimised(28)).isEqualTo("AB");

                Assertions.
                        assertThat(Strings.numberToColumn.convertToTitle_Optimised(26)).isEqualTo("Z");

                Assertions.
                        assertThat(Strings.numberToColumn.convertToTitle_Optimised(701)).isEqualTo("ZY");


            }

}
