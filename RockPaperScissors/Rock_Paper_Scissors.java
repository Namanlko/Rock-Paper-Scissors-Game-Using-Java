/*

ROCK, PAPER & SCISSORS GAME:

Rock-Paper-Scissors is a game played to settle disputes between two people. Thought to be a game of chance that depends on random luck similar to flipping coins. However, the game actually can be a game that has an element of skill that requires quick thinking and perceptive reasoning.

The game is played with three possible hand signals that represent a Rock, Paper and Scissors. The rock is a closed fist; paper is a flat hand with fingers and thumb extended and the palm facing downward; and scissors is a fist with the index and middle fingers fully extended toward the opposing player. Rock wins against scissors; paper wins against rock; and scissors wins against paper. If both players throw the same hand signal, it is considered a tie and play resumes until there is a clear winner.

 */

package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 1. Choose 0 - For Rock
        // 2. Choose 1 - For Paper
        // 3. Choose 2 - For Scissors

        System.out.println("Player: Choose(0) - Rock, Choose(1) - Paper, Choose(2) - Scissors");
        int player = sc.nextInt();

        // Random Function is used to generate Random Number from 0 to 2.

        int computerInput = random.nextInt(3);

        if(player == computerInput){
            System.out.println("Game is tie!");
        }

        else{
            switch(player){
                case 0:
                    if(computerInput == 1)
                        System.out.println("Computer Wins!");
                    else
                        System.out.println("You Wins!");
                    break;
                case 1:
                    if(computerInput == 2)
                        System.out.println("Computer Wins!");
                    else
                        System.out.println("You Wins!");
                    break;
                case 2:
                    if(computerInput == 0)
                        System.out.println("Computer Wins!");
                    else
                        System.out.println("You Wins!");
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }
        System.out.println("Computer Chooses : "+computerInput);
    }
}
