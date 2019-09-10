import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args){

        // Declare new array with 10 elements
        int[] numbers = new int [10];

        // Create new object of the Scanner class to read in input
        Scanner in = new Scanner(System.in);

        int sum =0;

        // Declare for loop to run 10 times
        for(int i = 0; i < numbers.length; i++){
            // Prompt user to enter in 10 numbers
            System.out.print("Enter number: ");

            // Read in number from user, store into array element (numbers[i])
            numbers[i] = in.nextInt();

            // Add that number to "sum"
            sum = sum + numbers[i];
        }

        // Print out sum
        System.out.println("Sum of inputs: " + sum );

    }
}
