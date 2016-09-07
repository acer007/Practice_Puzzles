//Find the sum of all the digits in a number between 0 and 1000

import java.util.Scanner;

public class SumAllDigits{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter a number between 0 and 1000 and I will take " 
                                + "the sum of its digits: ");
            
            int num = 0;
            
            //Check input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    num = scanInput.nextInt();
                    
                    if (num <= 0 || num >= 1000){
                        
                        int badInputInt = num;
                        System.out.print("\nPlease enter a number between 0 and " + 
                                            "1000: ");
                        
                    }
                    
                    else{
                        break;
                    }
                    
                }
                
                else{
                    
                    String badInputStr = scanInput.next();
                    System.out.print("\nPlease enter a number between 0 and 1000: ");
                    
                }
                
            }
            
            //Find the sum of all the digits in the number
            int sum = 0;
            double digit = 0;
            
            for (int k = 3; k > 0 ; k--){
                
                digit = ((num % Math.pow(10, k)) - (num % Math.pow(10, k-1))) / Math.pow(10, k-1);
                //System.out.println("Digit: " + digit);
                
                sum += digit;
                //System.out.println("Sum: " + sum);
            }
            
            System.out.println("The sum of all its digits is " + sum);
        
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());    
        }
        
    }//end of main
    
}//end of class