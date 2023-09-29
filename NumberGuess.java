import java.util.Scanner;

public class NumberGuess {

    public static void numberGuessingGame() {

        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());
        int attempts = 5;
        int i, guess;
        int score = 100;
        boolean flag = false;

        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 attempts");

        for (i = 0; i < attempts; i++) {

            System.out.print("Guess the number: ");

            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations!" + " You have guessed the number in " + (i + 1) + " attempts");
                System.out.println("Your score is " + score);
                flag = true;
                break;
            } else if (number > guess) {
                System.out.println("The number is " + "greater than " + guess);
                System.out.println("You have " + (attempts - 1 - i) + " attempt(s) left.\n");
            } else {
                System.out.println("The number is" + " less than " + guess);
                System.out.println("You have " + (attempts - 1 - i) + " attempt(s) left.\n");
            }

            score = score - 20;
        }

        if (flag == false) {
            System.out.println("You have exhausted" + " 5 attempts.");

            System.out.println("The number was " + number);
        }
    }

    public static void main(String arg[]) {

        numberGuessingGame();
    }
}