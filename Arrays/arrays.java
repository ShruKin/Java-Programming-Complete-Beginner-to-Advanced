public class arrays {
    public static void main(String[] args) {
        int number = 10;    //  primitive type
        int[] numbers = new int[5];   //  reference type

        int[] moreNumbers = {15, 20, 25, 30, 35};

        System.out.println(numbers[0]);
        numbers[0] = 15;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        for(int i=0; i<moreNumbers.length; i++){
            System.out.print(moreNumbers[i] + " ");
        }

        /*  
        default values
            int - 0
            String - null
            boolean - false
        */
    }
}