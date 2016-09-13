// Rock, Paper, Scissors program

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Variables
            boolean proceed = true, sentinel = true, loop = true;
            String key = "e";
            int input = -1;
            
            while (proceed){
                
                //Computer generated number
                int comp = randomInt();
                
                //Prompt input
                System.out.println("Scissors(0) Rock(1) Paper(2)");
                System.out.print("Enter Input: ");
                
                //Verify input
                while (sentinel){
                    input = verifyInput(scanInput);
                    
                    if (input == -1){
                        System.out.println("\nRe-enter: ");
                    }
                    else{
                        sentinel = false;
                    }
                }
                
                //Determine Winner
                //Computer picked Scissors
                if (comp == 0){
                    if (input == 0)
                        System.out.println("Computer picked Scissors" + 
                        "\nPlayer picked Scissors\n" + "Outcome: Tie");
                    if (input == 1)
                        System.out.println("Computer picked Scissors" + 
                        "\nPlayer picked Rock\n" + "Outcome: Player Wins");
                    if (input == 2)
                        System.out.println("Computer picked Scissors" + 
                        "\nPlayer picked Paper\n" + "Outcome: Computer Wins");
                }
                
                //Computer picked Rock
                if (comp == 1){
                    if (input == 0)
                        System.out.println("Computer picked Rock" + 
                        "\nPlayer picked Scissors\n" + "Outcome: Computer Wins");
                    if (input == 1)
                        System.out.println("Computer picked Rock" + 
                        "\nPlayer picked Rock\n" + "Outcome: Tie");
                    if (input == 2)
                        System.out.println("Computer picked Rock" + 
                        "\nPlayer picked Paper\n" + "Outcome: Player Wins");
                }
                
                //Computer picked Paper
                if (comp == 2){
                    if (input == 0)
                        System.out.println("Computer picked Paper" + 
                        "\nPlayer picked Scissors\n" + "Outcome: Player Wins");
                    if (input == 1)
                        System.out.println("Computer picked Paper" + 
                        "\nPlayer picked Rock\n" + "Outcome: Computer Wins");
                    if (input == 2)
                        System.out.println("Computer picked Paper" + 
                        "\nPlayer picked Paper\n" + "Outcome: Tie");
                }
                
                //Determine Whether to continue the game
                System.out.print("\nWould you like to play again?\n" + 
                                        "(Enter 'Y' or 'y' to continue or " + 
                                        "enter 'Q' or 'q' to quit): ");
                    
                    while (loop){
                        
                        key = verifyContinuation(scanInput);
                        
                        if (key.equals("Q") || key.equals("q")){
                            loop = false;
                            proceed = false;
                        }
                        else if (key.equals("e")){
                            System.out.println("Please re-enter 'Y' or 'y' to" +
                            " continue or enter 'Q' or 'q' to quit: ");
                        }
                        else{
                            sentinel = true;
                            System.out.println();
                            break;
                        }
                    }
                    
            }

            
        }//end try block
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }//end catch block
        
    }//end main
    
    //Method
    
    /* Generate random number
     * Parameters:
     * return: integer
     */
    public static int randomInt(){
        
        Random rand = new Random();
        
        int randomNum = rand.nextInt((2 - 0) + 1) + 0;
        return randomNum;
        
    }
    
    /* Verify input
     * Parameters: Scanner
     * return: integer
     */
    public static int verifyInput(Scanner scanInput){
        
        int input = -1;
        if (scanInput.hasNextInt()){
            
            input = scanInput.nextInt();
            
            if (input >= 0 && input <=2)
                return input;
                
            else{
                int badInputInt = input;
                return -1;
            }
            
        }
        else{
            String badInputStr = scanInput.next();
            return -1;
        }
        
    }
    
    /* Verify continuation
     * Parameters: Scanner
     * return: String
     */
    public static String verifyContinuation (Scanner scanInput){
        
        String key = "e";
        if (scanInput.hasNext()){
            
            key = scanInput.next();
            
            if (key.equals("Y") || key.equals("y") || key.equals("Q") || key.equals("q"))
                return key;
                
            else{
                String badInputStr = key;
                return "e";
            }
        }
        
        else{
            String badInputStr = scanInput.next();
            return "e";
        }
        
    }
    
}//end class