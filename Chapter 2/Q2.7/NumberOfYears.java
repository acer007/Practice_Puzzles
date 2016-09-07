//Allow user to enter the number of minutes
//Program will convert minutes to the number of years and days

import java.util.Scanner;

public class NumberOfYears{
    
    public static void main (String args[]){
        
        try{
            
            //Declare scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.println("Minutes Converter" + 
                                "\n--------------------------------\n");
            System.out.print("Enter the number of minutes: ");
            
            //Verify Input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    int minutes = scanInput.nextInt();
                    
                    if (minutes < 0){
                        
                        int badInputInt = minutes;
                        System.out.println("Re-enter the number of minutes " + 
                                    "as a positive whole number: ");
                    }
                    
                    else
                        break;
                    
                }
                
                else{
                    
                    String badInputStr = scanInput.next();
                    System.out.print("Enter the number of minutes as a " + 
                                        "whole number: ");
                    
                }
            }
            
            
        
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
}//end of class