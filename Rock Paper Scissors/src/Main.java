import java.util.Scanner;
public class Main {
    public static void main(String args[]){



        Scanner scan = new Scanner(System.in); //prepares program for user input
        int playerScore = 0;
        int computerScore = 0;
        System.out.println("Choose rock paper or scissors. 'r' for rock 'p' for paper, or 's' for scissors.  Choose 'x' to exit the game."); //Game instructions
        System.out.println("**********************************************************");

        while(true){

            System.out.println("Player's choice:");
        char choice = scan.next().charAt(0); //The player's choice will be the letter inputted.
            if(choice == 'x'){
                break;
            }
        int random = (int)(Math.random()*99 + 1); //math random creates a number between 0-1 (e.g. 0.125121313135)
        //this is converted into a integer from 1-99
        char computer;


        if (random <= 33){
            computer = 'r'; //if number is from 1-33 computer will choose rock
        }
        else if(random <= 66){
            computer = 'p'; //if number is from 34-66 computer will choose paper
        }
        else{
            computer = 's'; //if number is from 67-99 computer will choose scissors
        }//this determines if the computer will choose rock, paper, or scissors

        if((choice == 'r') && (computer == 'r')){
            System.out.println("draw!\n");
            System.out.println("Computer Choice: Rock\t\tPlayer Choice: Rock");

        }
        else if((choice == 'r') && (computer == 'p')){
            System.out.println("lose!\n");
            System.out.println("Computer Choice: Paper\t\tPlayer Choice: Rock");
            computerScore ++;

        }
        else if(choice == 'r'){
            System.out.println("win!\n");
            System.out.println("Computer Choice: Scissors\t\tPlayer Choice: Rock");
            playerScore ++;
        // the possible outcomes if you choose rock
        }
        else if((choice == 'p') && (computer == 'r')){
            System.out.println("win!\n");
            System.out.println("Computer Choice: Rock\t\tPlayer Choice: Paper");
            playerScore ++;

        }
        else if((choice == 'p') && (computer == 'p')){
            System.out.println("draw!\n");
            System.out.println("Computer Choice: Paper\t\tPlayer Choice: Paper");

        }
        else if(choice == 'p'){
            System.out.println("lose!\n");
            System.out.println("Computer Choice: Scissors\t\tPlayer Choice: Paper");
            computerScore ++;
        // the possible outcomes if you choose paper
        }
        else if((choice == 's') && (computer == 'r')){
            System.out.println("lose!\n");
            System.out.println("Computer Choice: Rock\t\tPlayer Choice: Scissors");
            computerScore ++;

        }
        else if((choice == 's') && (computer == 'p')){
            System.out.println("win!\n");
            System.out.println("Computer Choice: Paper\t\tPlayer Choice: Scissors");
            playerScore ++;

        }
        else if(choice == 's'){
            System.out.println("draw!\n");
            System.out.println("Computer Choice: Scissors\t\tPlayer Choice: Scissors");
        // the possible outcomes if you choose scissors

        }//The program compares your selection and the computer selection and decides if you win, draw, or lose.
        else {
            System.out.println("Invalid selection.  Please try again."); //error message for when user does not input r,p, or s.
        }
            System.out.println("Player score: " + playerScore + "\tComputer score: " + computerScore);
            System.out.println("\n**********************************************************\n");






    }
}}
