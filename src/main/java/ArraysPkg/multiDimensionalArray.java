package ArraysPkg;

public class multiDimensionalArray {


    public static void printMatrix(int [][]t)
    {
        for (int i = 0; i <t.length ; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] +" ");

            }
            System.out.println();

        }
    }

    public static void printMatrix(boolean [][]t)
    {
        for (int i = 0; i <t.length ; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] +" ");

            }
            System.out.println();

        }
    }
}
