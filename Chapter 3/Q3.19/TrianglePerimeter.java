//Determine validity of input and compute the perimeter of a triangle

import java.util.Scanner;

public class TrianglePerimeter{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Declare Variables
            boolean proceed = true, loop = true, verify = true;
            double side1 = 0, side2 = 0, side3 = 0, perimeter = 0;
            String key = "e";
            
            
            while (loop){
                
                //Prompt User input
                System.out.print("Please enter valid lengths of the three " + 
                "sides of a triangle in centimeters in order to calculate " + 
                "the perimeter: ");
                
                while (proceed){
                    
                    side1 = verifyInput(scanInput);
                    side2 = verifyInput(scanInput);
                    side3 = verifyInput(scanInput);
                    
                    if (side1 != -1 && side2 != -1 && side3 != -1){
                        proceed = false;
                    }
                    else{
                        System.out.print("\nRe-enter the three sides of a " + 
                        "triangle: ");
                    }
                    
                }
                
                //Calculate Perimeter if the lengths are valid
                if (((side1 + side2) > side3) && 
                    ((side1 + side3) > side2) && 
                    ((side2 + side3) > side1)
                ){
                    perimeter = side1 + side2 + side3;
                    System.out.println("Inputs are valid\nThe perimeter of " + 
                    "the triangle is " + perimeter + " centimeters");
                }
                else{
                    System.out.println("Inputs are invalid\nCannot calculate " + 
                    "the triangle's perimeter");
                }
            
                //Continue the program
                System.out.print("\nPerform another calculation? ('y'/'Y' " + 
                "for yes or 'q'/'Q' to quit): ");
                
                while (verify){
                    
                    key = verifyContinuation(scanInput);
                        
                        if (key.equals("Q") || key.equals("q")){
                            verify = false;
                            loop = false;
                        }
                        else if (key.equals("e")){
                            System.out.println("Please re-enter 'Y' or 'y' to" +
                            " continue or enter 'Q' or 'q' to quit: ");
                        }
                        else{
                            proceed = true;
                            System.out.println();
                            break;
                        }
                        
                }
                
            }
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end main
    
    /* Verify input
     * Parameters: Scanner
     * return: double
     */
    public static double verifyInput(Scanner scanInput){
        
        double input = -1;
        
        if (scanInput.hasNextDouble()){
            
            input = scanInput.nextDouble();
            
            if (input < 0)
                return -1;
            else
                return input;
            
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
    
}//end class