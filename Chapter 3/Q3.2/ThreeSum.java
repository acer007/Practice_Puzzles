// Add the sum of three random digits randomly generated by the program

import java.util.Scanner;

public class ThreeSum{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner and Variables
            Scanner scanInput = new Scanner(System.in);
            
            int num1 = (int)(System.currentTimeMillis() % 10);
            int num2 = (int)(System.currentTimeMillis() / 7 % 10);
            int num3 = (int)(System.currentTimeMillis() / 4 % 10);
            
            //Prompt input
            System.out.print("What is " + num1 + " + " + num2 + 
                                " + " + num3 + " = ");
                                
            //Verify input
            int answer = 0;
            
            //Check input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    answer = scanInput.nextInt();
                    break;
                    
                }
                
                else{
                    
                    String badInputStr = scanInput.next();
                    System.out.print("\nPlease enter an answer as an integer: ");
                    
                }
                
            }
            
            if ((num1 + num2 + num3) == answer)
                System.out.println("Correct!");
                
            else
                System.out.println("Incorrect, the answer is " + (num1 + num2 + num3));
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
}//end of class