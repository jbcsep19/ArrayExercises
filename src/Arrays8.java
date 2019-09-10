public class Arrays8 {
    public static void main(String[] args){

        // Declare array and initialize array with the following letters
        String[] letters = {"w","t","y","h","k"};

        // Loop through array
        for(int i = 0; i < letters.length; i++){
            // Check if current array element's value is equal to 't'
            if(letters[i].equalsIgnoreCase("t")){
                // If so, replace it with the word "hello"
                letters[i] = "hello";
            }

            // Print out the current letter
            System.out.println(letters[i]);
        }

    }
}
