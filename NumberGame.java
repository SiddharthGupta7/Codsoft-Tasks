import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the NUMBER GAME");
        System.out.println("How many rounds would you like to play");
        int rounds = sc.nextInt();
        System.out.println("Each round offer a total of 5 attempts");
        // Generating random number from 1 to 100
        Random rand = new Random();
        System.out.println("The random number generated range from 1 to 100");
        int score = 0;
        for (int i = 0; i < rounds; i++) {
            System.out.println("Round: " + (i + 1));
            int attempts = 5;
            boolean won = false;
            int random_number = rand.nextInt(100)+1;
            while (attempts > 0 && won == false) {

                System.out.println("Enter your guess for the generated random number");
                int guess = sc.nextInt();
                if (guess == random_number) {
                    won = true;
                    score++;
                }
                if (guess > random_number) {
                    System.out.println("The guess was too high");
                    attempts--;
                }
                if (guess < random_number) {
                    System.out.println("The guess was too low");
                    attempts--;
                }
            }
            if (won == true) {
                System.out.println("You Guessed the correct number");
            } else {
                System.out.println(
                        "All the attemps of round: " + (i + 1) + " are over and the random number has changed");
            }
        }
        System.out.println("Your Score Was " + score + (" out of ") + (rounds));
        sc.close();
    }
}
