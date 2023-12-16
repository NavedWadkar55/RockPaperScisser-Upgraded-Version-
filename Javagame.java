import java.util.Scanner;
import java.util.Random;
public class Javagame{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String[] rps ={"rock","paper","scissor","lizard","spock"};
    char choice ;
    do {

    String computerMove= rps[new Random().nextInt(rps.length)];
   
    String playerMove;
    while (true) {
         System.out.println("Enter your move(rock,paper,scissor,lizard,spock):");
         String move = sc.nextLine();
         playerMove = move.toLowerCase();
         if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor") || playerMove.equals("lizard") || playerMove.equals("spock")   ) {
            break;
        }
        else 
        System.out.println(playerMove+"is an invalid move");
    }
    System.out.println("computer played:"+ computerMove);
    if(playerMove.equals(computerMove)){
        System.out.println("The game was a tie!");
    }
    else if (playerMove.equals("rock")) {
        if(computerMove.equals("paper")){
            System.out.println("You Lose!");
        }
        else if(computerMove.equals("scissor")){
            System.out.println("You Win!");
        }
        else if(computerMove.equals("spock")){
            System.out.println("You lose!");
        }
        else if (computerMove.equals("lizard")){
            System.out.println("You Win!");
        }
        
    }
     else if (playerMove.equals("scissor")) {
        if(computerMove.equals("paper")){
            System.out.println("You Win!");
        }
        else if(computerMove.equals("rock")){
            System.out.println("You lose!");
        }
        else if(computerMove.equals("spock")){
            System.out.println("You lose!");
        }
        else if (computerMove.equals("lizard")){
            System.out.println("You Win!");
        }
        
    }
     else if (playerMove.equals("spock")) {
        if(computerMove.equals("paper")){
            System.out.println("You Lose!");
        }
        else if(computerMove.equals("scissor")){
            System.out.println("You Win!");
        }
        else if(computerMove.equals("rock")){
            System.out.println("You Win!!");
        }
        else if (computerMove.equals("lizard")){
            System.out.println("You lose!");
        }
        
    }
     else if (playerMove.equals("lizard")) {
        if(computerMove.equals("paper")){
            System.out.println("You Win!");
        }
        else if(computerMove.equals("scissor")){
            System.out.println("You lose!");
        }
        else if(computerMove.equals("spock")){
            System.out.println("You Win!");
        }
        else if (computerMove.equals("rock")){
            System.out.println("You lose!");
        }
        
    }
     else if (playerMove.equals("paper")) {
        if(computerMove.equals("rock")){
            System.out.println("You win!");
        }
        else if(computerMove.equals("scissor")){
            System.out.println("You lose!");
        }
        else if(computerMove.equals("spock")){
            System.out.println("You Win!");
        }
        else if (computerMove.equals("lizard")){
            System.out.println("You lose!");
        }
        
    }
    System.out.println(" Enter yes to play again ");
    choice = sc.next().charAt(0);

} 
while (choice == 'y' || choice == 'Y');
}

}