import java.util.Scanner;
import java.util.Random;;

public class numberGuessingGame {
    public static void main(String[] args) {
        boolean moreRounds = false;

        do {
            Scanner reader = new Scanner(System.in);

            // Wellcome message
            System.out.println("Welcome to the Number Guessing Game!");
            
            // Select random number
            System.out.println(("I'm thinking of a number between 1 and 100.\n"));
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            
            // Select difficulty level
            System.out.println(
                            "Please select the difficulty level:\n" + //
                            "1. Easy (10 chances)\n" + //
                            "2. Medium (5 chances)\n" + //
                            "3. Hard (3 chances)\n");

            // Choice difficulty level       
            int chancesNumber = 0;
            
            while (true) {
                System.out.print("Enter your choice: ");
                int difficulty = reader.nextInt();
                if (difficulty == 1) {
                    chancesNumber = 10;
                    break;
                } else if (difficulty == 2) {
                    chancesNumber = 5;
                    break;
                } else if (difficulty == 3) {
                    chancesNumber = 3;
                    break;
                } else {
                    System.out.println("The number is incorrect, choice a number (1, 2 or 3)\n");
                }
            }


            System.out.println(
                            "\nGreat! You have selected the Medium difficulty level.\n" + //
                            "You have " + chancesNumber + " chances to guess the correct number.\n" +
                            "Let's start the game!\n");

            int numberGuess = 0;
            int attempts = 0;

            for (int i = 0; i < chancesNumber; i++) {
                System.out.print("Enter your guess: ");
                numberGuess = reader.nextInt();
                attempts++;

                if (numberGuess > number) {
                    System.out.println("Incorrect! The number is less than " + numberGuess + "\n");
                } else if (numberGuess < number) {
                    System.out.println("Incorrect! The number is greater than " + numberGuess + "\n");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                }
            }

                // --- Features ---

                // Allow multiple rounds

            System.out.println(
                            "\nDo you want one more round?\n" +
                            "0. Yes\n" + 
                            "1. No\n");

            while (true) {
                System.out.print("Enter your choice: ");
                int choiceRounds = reader.nextInt();
                if (choiceRounds == 0) {
                    moreRounds = true;
                    break;
                } else if (choiceRounds == 1) {
                    moreRounds = false;
                    break;
                } else {
                    System.out.println("The number is incorrect, choice a number (0 or 1)\n");
                }
            }  


        } while (moreRounds);
        
        
    }
    
}
