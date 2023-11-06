
// Task 3

import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
      
       // Create a Scanner object   	 
          Scanner scanner = new Scanner(System.in);
       
       // Read user input
    	  int numberGuess = 24;
        //use hasNextDouble to check if input is numeric, 
        // if so...
          if (scanner.hasNextInt()) {
                 numberGuess = scanner.nextInt();
                }
            //Compare it with the random number //Let the user know the result of the comparison
            
             if (numberGuess == random_number) { 
                System.out.println("Your guess of number is correct, congrats!!!"); 
               } 
               else {
                if (numberGuess > random_number) {
                    System.out.println("Your guess of number is too big, try again!"); //   Help the user by revealing wether the guess was lower or higher than the target number
                }
                else {
                    System.out.println("Your guess of number is too low, try again!"); //   Help the user by revealing wether the guess was lower or higher than the target number
                }
                makeAGuess(); //   Let the user try again by calling this method recursively
            }
        }
            if(numberGuess == random_number) {  // if input was not numeric show an error message and call this method recursively
            System.out.println(" An error ocurred, enter only a numeric number, try again"); 
            makeAGuess();
        }
}
   

