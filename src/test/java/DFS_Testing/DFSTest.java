package DFS_Testing;

import DFS.genenateParanthesis;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DFSTest {


    @Test
    public void generateParanthesis_Testing()
    {
//        genenateParanthesis.generateParenthesis(2);
//        genenateParanthesis.generateParenthesis(1);
//        genenateParanthesis.generateParenthesis(3);
        //Assertions.assertThat(genenateParanthesis.generateParenthesis(1)).isEqualTo( )
        Assertions.assertThat(genenateParanthesis.generateParenthesis(1)).containsExactly("()");
        Assertions.assertThat(genenateParanthesis.generateParenthesis(2)).containsExactlyInAnyOrder("()()","(())");
        Assertions.assertThat(genenateParanthesis.generateParenthesis(3)).containsExactlyInAnyOrder("()()()","((()))","(())()","()(())","(()())");
        //Assertions.assertThat(genenateParanthesis.generateParenthesis(1)).isEqualTo()


    }

}
