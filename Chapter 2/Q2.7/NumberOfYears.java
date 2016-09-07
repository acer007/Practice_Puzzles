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
            int minutes = 0;
            
            //Verify Input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    minutes = scanInput.nextInt();
                    
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
            
            /*Convert minutes to years and days
             *525600 minutes in a year
             *1440 minutes in a day
             */
            int years = minutes / 525600;
            int days = (minutes % 525600) / 1440;
            
            //Display conversion
            System.out.println(minutes + " minutes is equal to " + years + 
                                " years and " + days + " days.");
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
}//end of class