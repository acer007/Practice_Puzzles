//Find the sum of all the digits in a number between 0 and 1000

import java.util.Scanner;

public class SumAllDigits{
    
    public static void main (String args[]){
        
        //Declare Scanner
        Scanner scanInput = new Scanner(System.in);
        
        //Prompt input
        System.out.println("Enter a number between 0 and 1000 and I will take " 
                            + "the sum of its digits: ");
        
        //Check input
        while (scanInput.hasNext()){
            
            if (scanInput.hasNextInt()){
                
                int num = scanInput.nextInt();
                
                if (num < 0 || num > 1000){
                    
                    int badInputInt = num;
                    System.out.println("Please enter a number between 0 and " + 
                                        "1000");
                    
                }
                
                else{
                    break;
                }
                
            }
            
            else{
                
                String badInputStr = scanInput.next();
                System.out.println("Please enter a number between 0 and 1000");
                
            }
            
        }
        
    }//end of main
    
}//end of class