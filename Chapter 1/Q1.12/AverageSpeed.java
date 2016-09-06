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
        
        
    }//end of main
    
}//end of class