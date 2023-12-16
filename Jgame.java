import java.util.Scanner;
import java.util.Random;

public class Jgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rps = { "rock", "paper", "scissor", "lizard", "spock" };
        char choice;

        do {
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;
            while (true) {
                System.out.print("Enter your move (rock, paper, scissor, lizard, spock): ");
                playerMove = sc.nextLine();
                if (isValidMove(playerMove)) {
                    break;
                } else {
                    System.out.println(playerMove + " is an invalid move");
                }
            }
            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("scissor")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("spock")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("lizard")) {
                    System.out.println("You Win!");
                }

            } else if (playerMove.equals("scissor")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("spock")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("lizard")) {
                    System.out.println("You Win!");
                }

            } else if (playerMove.equals("spock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("scissor")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("rock")) {
                    System.out.println("You Win!!");
                } else if (computerMove.equals("lizard")) {
                    System.out.println("You lose!");
                }

            } else if (playerMove.equals("lizard")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("scissor")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("spock")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                }

            } else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("scissor")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("spock")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("lizard")) {
                    System.out.println("You lose!");
                }
            }

            System.out.print("Enter 'yes' to play again: ");
            choice = sc.next().charAt(0);
            sc.nextLine(); // Consume the newline character

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for playing!");
        sc.close();
    }

    public static boolean isValidMove(String move) {
        String[] validMoves = { "rock", "paper", "scissor", "lizard", "spock" };
        for (String validMove : validMoves) {
            if (move.equals(validMove)) {
                return true;
            }
        }
        return false;
    }
}