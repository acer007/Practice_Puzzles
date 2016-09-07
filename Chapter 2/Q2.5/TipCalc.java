//Calculate the tip and total cost given the subtotal and gratuity rate

import java.util.Scanner;

public class TipCalc{
    
    public static void main (String args[]){
        
        //Declare Scanner
        Scanner scanInput = new Scanner(System.in);
        
        //Prompt input
        System.out.print("Please enter the subtotal (Ex: 10.56): ");
        double subTotal = 0;
        
        //Check input
        while (scanInput.hasNext()){
            
            if (scanInput.hasNextInt()){
                
                subTotal = scanInput.nextInt();
                
                if (subTotal < 0){
                    
                    double badInputInt = subTotal;
                    System.out.println("Please re-enter the subtotal: ");
                    
                }
                
                else{
                    break;
                }
                
            }
            
            else{
                
                String badInputStr = scanInput.next();
                System.out.println("Please re-enter the subtotal: ");
                
            }
            
        }
        
        System.out.print("\nPlease enter the tip percentage (Ex: 15.50): ");
        double tip = 0;
        
        while (scanInput.hasNext()){
            
            if (scanInput.hasNextInt()){
                
                tip = scanInput.nextInt();
                
                if (tip < 0){
                    
                    double badInputInt = tip;
                    System.out.println("Please re-enter the tip: ");
                    
                }
                
                else{
                    break;
                }
                
            }
            
            else{
                
                String badInputStr = scanInput.next();
                System.out.println("Please re-enter the tip: ");
                
            }
            
        }
        
        
        
    }//end of main
    
}//end of class