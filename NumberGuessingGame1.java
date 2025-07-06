import java.util.InputMismatchException; 
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame1 {
        public static void main(String[] args) {
        NumberGuessingGame1 game = new NumberGuessingGame1();
        game.startGame();
    }
    private static final int min_number = 1;
    private static final int max_number = 100;
    private static final int max_attempts = 8; 

    private final Scanner scanner; 
    private final Random random;   
    private int score;
    private int roundsPlayed;

    public NumberGuessingGame1() {
        scanner = new Scanner(System.in);
        random = new Random();
        score = 0;
        roundsPlayed = 0;
    }
    public void startGame() {
        System.out.println("+-*/ Welcome to the Ultimate Number Guessing Game! /*-+");
        System.out.println("I'll pick a secret number between " + min_number + " and " + max_number + ".");
        System.out.println("Your mission: Guess the secret number in " + max_attempts + " attempts or fewer. Good luck!\n");

        boolean playing = true;
        while (playing) {
            roundsPlayed++;
            playSingleRound(); 
            playing = askToPlayAgain(); 
        }

        System.out.println("\n--- Game Over! ---");
        System.out.println("Your final score: " + score + " successful guesses in " + roundsPlayed +" rounds.");
        System.out.println("Thanks for playing!");
        scanner.close(); 
    }
    private void playSingleRound() {
        int targetNumber = random.nextInt(max_number - min_number + 1) + min_number;
        int attemptsMade = 0;

        System.out.println("\n--- New Round Started ---");
        System.out.println("I've chosen a new secret number. Start guessing!");

        while (attemptsMade < max_attempts) {
            System.out.print("Attempt " + (attemptsMade + 1) + "/" + max_attempts + ". Enter your guess: ");
            int userGuess = getUserGuessInput(); 

            attemptsMade++; 

            if (userGuess == targetNumber) {
                System.out.println("\n*** CONGRATULATIONS! ***");
                System.out.println("You  guessed the number " + targetNumber + " in " + attemptsMade + " attempt(s)!");
                score++; 
                return; 
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! The secret number is higher.");
            } else { 
                System.out.println("Too high! The secret number is lower.");
            }
            
        }

        
        System.out.println("\n--- Oh no! You've run out of attempts. ---");
        System.out.println("The secret number was: " + targetNumber + ".");
    }
    
    private int getUserGuessInput() {
        while (true) { 
            try {
                int guess = scanner.nextInt();
                scanner.nextLine(); 

                if (guess >= min_number && guess <= max_number) {
                    return guess; 
                } else {
                    System.out.println("Oops! Your guess must be between " + min_number + " and " + max_number + ". Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not a number! Please enter a whole number.");
                scanner.nextLine(); 
            }
        }
    }
    
    private boolean askToPlayAgain() {
        System.out.print("\nWould you like to play another round? (yes/no): ");
        String read = scanner.nextLine().trim().toLowerCase();
        return read.equals("yes");
    }
}

    