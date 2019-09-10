public class Arrays9 {
    public static void main(String[] args){

        int [] num1 = {1,7,6,5,9};
        int [] num2= {2,7,6,3,4};

        // Loop through first array
        for (int i = 0; i<num1.length; i++){
            // Loop through second array for each number of the first array
            for (int j = 0; j<num2.length; j++){
                // Check if the number from the first array and second array
                // is equal
                if (num1[i] + num2[j] == 13){
                    // If so, print out the two numbers
                    System.out.println("(" + num1[i] + ", " + num2[j] + ")");
                }
            }
        }

    }
}
