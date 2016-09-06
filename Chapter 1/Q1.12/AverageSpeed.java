//Convert Miles Per Hour To Kilometers Per Hour

import java.util.Scanner;

public class AverageSpeed{
    
    public static void main (String args[]){
        
        //Declare Scanner
        Scanner scanInput = new Scanner(System.in);
        
        //Prompt input
        System.out.print("Enter the miles ran: ");
        int miles = 0;
        
        //Check input
        while (scanInput.hasNext()){
            
            if (scanInput.hasNextInt()){
                
                miles = scanInput.nextInt();
                
                if (miles < 0){
                    
                    int badInputInt = miles;
                    System.out.println("Please re-enter the number of miles " + 
                    "ran: ");
                    
                }
                
                else{
                    break;
                }
                
            }
            
            else{
                
                String badInputStr = scanInput.next();
                System.out.println("Please re-enter the number of miles ran: ");
                
            }
            
        }
        
        //Convert Average Speed and Time taken to run
        double kilometers = ((int)((miles * 1.6) * 100)) / 100.00;
        double kmPerSec = 24 * 1.6 / 6035; //24 miles in 1 hour 40 minutes and 35 seconds
        //double avgSpeedSec = ((int)((kilometers / kmPerSec) * 100)) / 100.00;
        
        int avgSpeedSec = (int)(kilometers / kmPerSec);
        System.out.println(avgSpeedSec + " seconds");

        int hour = avgSpeedSec / 3600;
        int minutes = avgSpeedSec % 3600 / 60;
        int seconds = avgSpeedSec % 3600 % 60;
        
        //Display Conversions
        System.out.println(miles + " miles is equal to " + kilometers + 
                            " kilometers");
                            
        System.out.println("The average speed to run that distance is : " + 
                            hour + " hours " + minutes + " minutes " + seconds 
                            + " seconds");
        
    }//end of main
    
}//end of class