//Calculate the cost of driving given the prompt for user input

import java.util.Scanner;

public class DrivingCost{
    
    public static void main (String args[]){
        
        try{
        
            //Declare Scanner and Variables
            Scanner scanInput = new Scanner(System.in);
            double distance=0;
            //, milesPerGallon, pricePerGallon, cost;
            boolean sentinel1 =true;
            
            //Prompt for input
            System.out.print("Enter the driving distance in miles: ");
            while (sentinel1){
                sentinel1 = verifyInput(scanInput, distance);
                System.out.println("\nDistance: " + distance);
            }
        
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
    //Functions
    
    //Verify input
    public static boolean verifyInput(Scanner scanInput, double input){
        
        if (scanInput.hasNextDouble()){
            
            input = scanInput.nextDouble();
            
                if (input < 0){
                    double badInputDoub = input;
                    System.out.print("\nRe-enter the distance: ");
                    return true;
                        
                }
                else
                    return false;
        }
        else{
            String badInputStr = scanInput.next();
            System.out.print("\nRe-enter the distance: ");
            return true;
        }
        
    }
    
    //Calculation
    
}//end of class