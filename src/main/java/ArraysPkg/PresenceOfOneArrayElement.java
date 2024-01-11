package ArraysPkg;

public class PresenceOfOneArrayElement {

    public static boolean sequenceOfElement(int[] Tocheck, int[] ToBeChecked)
    {

        int counter = 0;
            for(int j=0 ; j<Tocheck.length && counter<=ToBeChecked.length-1; j++)
            {

             if(ToBeChecked[counter]==Tocheck[j] )
             {
                 // once the element in small array matches the main array we will increase counter
                 counter++;
                 if(counter == ToBeChecked.length)
                 {
                     // end of secondary array reached
                     break;
                 }
             }
            }
            // if counter matches with lenth of array that means all element were found
            if(counter==ToBeChecked.length)
            {
                System.out.println("The Sequence is present and in order");
                return true;
            }
            else if(counter>0)
            {
                System.out.println("only few element were present in the Sequence");
                return false;
            }
            else
            {
                System.out.println("only few element were present in the Sequence");
                return false;
            }
        }
    }

