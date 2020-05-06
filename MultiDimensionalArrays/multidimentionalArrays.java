public class multidimentionalArrays {
    public static void main(String[] args) {
        int[] oneDimensionalArray = {12, 49, 922};
        System.out.println(oneDimensionalArray[1]);

        int[][] multiDimensionalArray = {{12, 49, 922}, {23, 56, 78, 12}, {12, 34, 56}};

        System.out.println(multiDimensionalArray[1][3]);

        double[][] array = new double[4][2];    //  default values
        double[][] array2 = new double[4][];    //  2nd size can be omitted
        System.out.println(array[2][1]);

        for(int i=0; i<multiDimensionalArray.length; i++){
            for(int j=0; j<multiDimensionalArray[i].length; j++){
                System.out.print(multiDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}