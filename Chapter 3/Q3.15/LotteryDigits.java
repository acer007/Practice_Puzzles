// Win an award (or not) depending on whether the user input matches the 
// winning lottery numbers

import java.util.Scanner;

public class LotteryDigits{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            boolean contLoop = true;

            while (contLoop){
                
                //Declare Variables
                String key = "e";
                int guess1 = 0;
                int guess2 = 0;
                int guess3 = 0;
                boolean sentinel1 = true, loop1 = true, loop2 = true;
                
                
                //Generate lottery numbers
                int lotNum1 = (int)(Math.random() * 100);
                int lotNum2 = (int)(Math.random() * 100 % 7);
                int lotNum3 = (int)(Math.random() * 100);
                /*System.out.println("Cheat: " + lotNum1 + " " + lotNum2 + 
                                    " " + lotNum3);*/
                
                //Prompt User Input
                System.out.print("Enter three guesses: ");
                
                //Verify inputs
                while (loop1){
                    
                    while (sentinel1){
                        guess1 = verifyInput(scanInput);
                        guess2 = verifyInput(scanInput);
                        guess3 = verifyInput(scanInput);
                        
                        if (guess1 != -1 && guess2 != -1 && guess3 != -1){
                            sentinel1 = false;
                            loop1 = false;
                        }
                        else{
                            System.out.print("\nRe-enter the Lottery: ");
                        }
                    }
                }
                
                //Check the guess
                //Exact match
                if (guess1 == lotNum1 && guess2 == lotNum2 && guess3 == lotNum3){
                    System.out.println("Congratulations! You have made an exact match. You im $10,000");
                    System.out.print("Would you like to play again?\n" + 
                                        "(Enter 'Y' or 'y' to continue " + 
                                        "or enter 'Q' or 'q' to quit): ");
                    
                    while (loop2){
                        
                        key = verifyContinuation(scanInput);
                        if (key.equals("Q") || key.equals("q")){
                            loop2 = false;
                            contLoop = false;
                        }
                        else if (key.equals("e")){
                            System.out.println("Please re-enter 'Y' or 'y' to" +
                            " continue or enter 'Q' or 'q' to quit: ");
                        }
                        else{
                            break;
                        }
                    }
                    
                }
                
                //All match
                else if ((guess1 == lotNum1 && guess2 == lotNum3 && guess3 == lotNum2) ||
                         (guess1 == lotNum3 && guess2 == lotNum2 && guess3 == lotNum1) ||
                         (guess1 == lotNum3 && guess2 == lotNum1 && guess3 == lotNum2) ||
                         (guess1 == lotNum2 && guess2 == lotNum1 && guess3 == lotNum3) ||
                         (guess1 == lotNum2 && guess2 == lotNum3 && guess3 == lotNum1)
                ){
                    System.out.println("Matched all digits: You win $3000!");
                    System.out.print("Would you like to play again?\n" + 
                                        "(Enter 'Y' or 'y' to continue " + 
                                        "or enter 'Q' or 'q' to quit): ");
                    
                    while (loop2){
                        
                        key = verifyContinuation(scanInput);
                        if (key.equals("Q") || key.equals("q")){
                            loop2 = false;
                            contLoop = false;
                        }
                        else if (key.equals("e")){
                            System.out.println("Please re-enter 'Y' or 'y' to" +
                            " continue or enter 'Q' or 'q' to quit: ");
                        }
                        else{
                            break;
                        }
                    }
                    
                }
                
                //One digit match
                else if ((guess1 == lotNum1 || guess2 == lotNum1 || guess3 == lotNum1) ||
                         (guess1 == lotNum2 || guess2 == lotNum2 || guess3 == lotNum2) ||
                         (guess1 == lotNum3 || guess2 == lotNum3 || guess3 == lotNum3)
                ){
                    System.out.println("Matched one digit: You win $1000!");
                    System.out.print("Would you like to play again?\n" + 
                                        "(Enter 'Y' or 'y' to continue or " + 
                                        "enter 'Q' or 'q' to quit): ");
                    
                    while (loop2){
                        
                        key = verifyContinuation(scanInput);
                        if (key.equals("Q") || key.equals("q")){
                            loop2 = false;
                            contLoop = false;
                        }
                        else if (key.equals("e")){
                            System.out.println("Please re-enter 'Y' or 'y' to" +
                            " continue or enter 'Q' or 'q' to quit: ");
                        }
                        else{
                            break;
                        }
                    }
                    
                }
                
                //No matches
                else{
                    System.out.println("No matches. Try your luck next time.");
                    System.out.print("Would you like to play again?\n" + 
                                    "(Enter 'Y' or 'y' to continue " + 
                                    "or enter 'Q' or 'q' to quit): ");
                    
                    while (loop2){
                        
                        key = verifyContinuation(scanInput);
                        if (key.equals("Q") || key.equals("q")){
                            loop2 = false;
                            contLoop = false;
                        }
                        else if (key.equals("e")){
                            System.out.println("Please re-enter 'Y' or 'y' to" +
                            " continue or enter 'Q' or 'q' to quit: ");
                        }
                        else{
                            break;
                        }
                    }
                }
            
            }//end of contLoop
            
        }//end of try block
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //Method
    /* Verify input
     * Parameters: Scanner
     * return: integer
     */
    public static int verifyInput(Scanner scanInput){
        
        int input = -1;
        if (scanInput.hasNextInt()){
            
            input = scanInput.nextInt();
            
            if (input >= 0)
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
    
}