import java.util.Scanner;
import java.util.Random;

public class NumberGuess{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(20) +1 ;
        int userGuess = 0;
        int attempts = 0;
        IO.println("Welcome to NumberGuess!");
        IO.println("I have chosen a number between 1 and 20");
        while(userGuess != numberToGuess){
            attempts++;
            IO.println("Please give me another number between 1 and 20");
            userGuess = input.nextInt();
            if(userGuess == numberToGuess){
                IO.println("You guessed the correct answer.");
                IO.println("Thank you for playing!");
                IO.println("You did: "+attempts+" attempts");
            }
            else if (userGuess > numberToGuess){
                IO.println("You gave bigger number");
            }
            else{
                IO.println("You gave smaller number");
            }
        }
        input.close();
    }
}