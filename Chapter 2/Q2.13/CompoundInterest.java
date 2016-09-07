//User enters a monthly saving amount
//Program calculates the account balance after the 6th month 

import java.util.Scanner;

public class CompoundInterest{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.println("Compound Interest Calculator" + 
                                "\n---------------------------------------" + 
                                "-----------------------------------------" + 
                                "-----------------\n"
                                + "\tPurpose: Program calculates the account " + 
                                "balance after 6 months given the specified \n" + 
                                "\tamount deposited by the user per month and " + 
                                "the annual interest rate of 5.00%");
                                
            System.out.print("\n\tEnter the amount of money saved into the account per month: $");
            double money = 0;
            
            //Verify Input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextDouble()){
                    money = scanInput.nextDouble();
                    
                    if (money < 0){
                        Double badInputDoub = money;
                        System.out.print("\n\tRe-enter the balance: $");
                        
                    }
                    else
                        break;
                }
                else{
                    String badInputStr = scanInput.next();
                    System.out.print("\n\tRe-enter the balance: $");
                }
                
            }
            
            //Calculate account balance
            double monthlyInt = 0.05 / 12;
            double amount = money;
            double balance = 0;
            
            
            //Display
        
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
}//end of class