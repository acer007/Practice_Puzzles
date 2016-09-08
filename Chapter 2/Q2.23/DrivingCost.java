//Calculate the cost of driving given the prompt for user input

import java.util.Scanner;

public class DrivingCost{
    
    public static void main (String args[]){
        
        try{
        
            //Declare Scanner and Variables
            Scanner scanInput = new Scanner(System.in);
            double distance = -1, milesPerGallon = -1, pricePerGallon = -1, cost = -1;
            boolean sentinel1 = true, sentinel2 = true, sentinel3 = true;
            
            //Prompt for input
            System.out.print("Enter the driving distance in miles: ");
            
            while (sentinel1){
                distance = verifyInput(scanInput);
                //System.out.println("\nDistance: " + distance);
                if (distance != -1){
                    sentinel1 = false;
                }
            }
            
            System.out.print("Enter the miles per gallon: ");
            
            while (sentinel2){
                milesPerGallon = verifyInput(scanInput);
                //System.out.println("\nDistance: " + distance);
                if (milesPerGallon != -1){
                    sentinel2 = false;
                }
            }
            
            System.out.print("Enter the price per gallon: $");
            
            while (sentinel3){
                pricePerGallon = verifyInput(scanInput);
                //System.out.println("\nDistance: " + distance);
                if (pricePerGallon != -1){
                    sentinel3 = false;
                }
            }
            
            //Display
            cost = calculateCost(distance, milesPerGallon, pricePerGallon);
            System.out.println("The cost of driving is $" + cost);
        
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
    //Functions
    
    //Verify input
    public static double verifyInput(Scanner scanInput){
        
        double input = -1;
        
        if (scanInput.hasNextDouble()){
            
            input = scanInput.nextDouble();
            
                if (input < 0){
                    double badInputDoub = input;
                    System.out.print("\nRe-enter the distance: ");
                    return -1;
                        
                }
                else
                    return input;
        }
        else{
            String badInputStr = scanInput.next();
            System.out.print("\nRe-enter the distance: ");
            return -1;
        }
        
    }
    
    //Calculation
    public static double calculateCost (double x, double y, double z){
        
        double amount = ((int)(x / y * z * 100)) / 100.00;
        return amount;
    }
    
}//end of class