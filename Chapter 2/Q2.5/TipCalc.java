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
            
            if (scanInput.hasNextDouble()){
                
                subTotal = scanInput.nextDouble();
                
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
            
            if (scanInput.hasNextDouble()){
                
                tip = scanInput.nextDouble();
                
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
        
        //Calculate Tip and Total
        double tipDecimal = tip / 100;
        double tipMoney = ((int)((tipDecimal * subTotal) * 100)) / 100.00;
        double total = subTotal + tipMoney;
        
        //Display Output
        System.out.println("For a " + tip + "%, the tip is $" + tipMoney + 
                            " and the total is $" + total);
        
    }//end of main
    
}//end of class