import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args){

        int sum = 0;
        double average = 0;

        // Declare array to hold 10 numbers
        int[] numbers = new int[10];

        // Declare new object of the Scanner class
        Scanner in = new Scanner(System.in);

        // Loop runs 10 times
        for (int index=0; index < numbers.length; index++){
            //Prompt user to enter number
            System.out.print("Enter number: ");

            // Read in user input and store into array
            numbers[index] = in.nextInt();

            // Add that input to the sum
            sum = sum + numbers[index];
        }

        // Calculate the average
        average = sum / numbers.length;

        // Print out the average
        System.out.println(average);
    }
}
