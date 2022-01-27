package DFS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class genenateParanthesis {
    public static List<String>  generateParenthesis(int n) {

        List<String> l = new ArrayList<String>();
        String s="";
        paranthesisDFSLogic(l,s,n,n,n);
        System.out.println(l);
        return l;
    }
    public static void paranthesisDFSLogic(List<String> l, String s, int left, int right, int n)
    {

        if(left>right)
        {
            return;
        }
        if(left>0)
        {
            //System.out.println("left > 0 Value of left is "+left );
            paranthesisDFSLogic(l,s+"(",left-1,right,n);
        }
        if(right>0)
        {
            //System.out.println("right > 0 Value of right is "+ right );
            paranthesisDFSLogic(l,s+")",left,right-1,n);
        }
        if(left==0 && right==0)
        {
           // System.out.println(s);
            l.add(s);
            return;
        }
    }

  }

