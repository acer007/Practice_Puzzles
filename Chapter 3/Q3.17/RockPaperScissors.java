// Rock, Paper, Scissors program

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Variables
            boolean proceed = true, sentinel = true;
            int input = -1;
            
            //Computer generated number
            int comp = randomInt();
            
            //Prompt input
            System.out.println("Scissors(0) Rock(1) Paper(2)");
            
            while (proceed){
                
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
                
                
                //Determine Whether to continue the game

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
    
}//end class