public class Arrays7 {
    public static void main(String[] args){
        // Declare and initialize array with numbers 1-10
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        // Loop through array backwards starting from the
        // last index of the
        // array and ending at zero
        for(int i=numbers.length-1; i>=0; i--){
            // Print out value of the current array element
            System.out.println(numbers[i]);
        }
    }
}
