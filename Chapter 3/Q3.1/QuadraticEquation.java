// Allow the user to enter coefficients for a quadratic equation
// Thr program will find the solutions

import java.util.Scanner;

public class QuadraticEquation{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner and Variables
            Scanner scanInput = new Scanner(System.in);
            double a = 0, b = 0, c = 0;
            double sol1 = 0, sol2 = 0;
            boolean sentinel1 = true, sentinel2 = true, sentinel3 = true;
            
            //Prompt input
            System.out.print("For ax^2 + bx + c, enter a, b, and c: ");
            
            //Verify all inputs
            while (sentinel1){
                a = verifyInput(scanInput);
                
                if (a != -1){
                    sentinel1 = false;
                }
                
            }
            
            while (sentinel2){
                b = verifyInput(scanInput);
                
                if (b != -1){
                    sentinel2 = false;
                }
            }
            
            while (sentinel3){
                c = verifyInput(scanInput);
                
                if (c != -1){
                    sentinel3 = false;
                }
                
            }
            
            //Calculate Solution
            
            
            //Display
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
    //Methods
    
    //Verify input
    public static double verifyInput(Scanner scanInput){
        
        double input = -1;
        
        if (scanInput.hasNextDouble()){
            
            input = scanInput.nextDouble();
            return input;
            
        }
        else{
            String badInputStr = scanInput.next();
            System.out.print("\nRe-enter the coefficients: ");
            return -1;
        }
        
    }
    
}//end of class