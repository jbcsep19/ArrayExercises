public class Arrays6 {
    public static void main(String[] args){

        // Declare and initialize an array with numbers
        int[] numbers = {2,5,9,0,2,1,8,5,4};

        // Loop through array
        for (int i = 0; i<numbers.length; i++){
            // Check if current array element value equals 5
            if (numbers[i]==5){
                // If the value is 5, print out the index (i)
                System.out.println("Index Number: " + i);
            }
        }

    }
}
