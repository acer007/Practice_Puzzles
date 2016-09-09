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
            boolean cont = true, sentinel1 = true, sentinel2 = true, sentinel3 = true;
            double discriminant = 0;
            
            /*while (cont){*/
                
                //Prompt input
                System.out.print("For ax^2 + bx + c, enter a, b, and c \nEnter 'q' to quit: ");
                
                /*if (scanInput.next() != "q"){*/
                    
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
                    
                    //Find Discriminant
                    discriminant = findDiscriminant(a, b, c);
                    
                    //Calculate Solution
                    if (discriminant > 0){
                        
                        sol1 = findPos(a, b, c);
                        sol2 = findNeg(a, b ,c);
                        System.out.println("The solutions are " + sol1 + " and " +
                                            sol2);
                        
                    }
                    
                    else if (discriminant == 0){
                        
                       sol1 = findPos(a, b, c);
                       System.out.println("The solution is " + sol1);
                        
                    }
                    
                    else{
                        System.out.println("The equation has no real roots");
                    }
                
                /*}//end of if statement
                
                else{
                    cont = false;
                }
            
            }//end of while loop*/
            
        }//end of try block
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
    //Methods
    
    /* Verify input
     * Parameters: Scanner
     * return: double
     */
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
    
    /* Find discriminant
     * Parameters: double x, y, and z
     * return: double
     */
     
    public static double findDiscriminant (double x, double y, double z){
        return (Math.pow(y, 2) - 4 * x * z);
    }
    
    /* Find the positive solution
     * Parameters: double x, y, z
     * return: double
     */
    public static double findPos (double x, double y, double z){
        
        double ans = 0;
        double numerator = -y + Math.sqrt(Math.pow(y, 2) - (4 * x * z));
        double denominator = 2 * x;
        ans = (int)(numerator / denominator * 1000) / 1000.00;
        return ans;
        
    }
     
    /* Find the negative solution
     * Parameters: double x, y, z
     * return: double
     */
    public static double findNeg (double x, double y, double z){
        
        double ans = 0;
        double numerator = -y - Math.sqrt(Math.pow(y, 2) - (4 * x * z));
        double denominator = 2 * x;
        ans = (int)(numerator / denominator * 1000) / 1000.00;
        return ans;
        
    }
     
     
}//end of class