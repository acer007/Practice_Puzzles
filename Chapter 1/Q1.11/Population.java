//Project the Population of a Population

import java.util.Scanner;

public class Population{
    
    public static void main (String args[]){
        
        //Declare Scanner object
        Scanner scanInput = new Scanner(System.in);
        
        //Prompt for input
        System.out.print("Enter the population of a jurisdiction: ");
        int origPopulation = 0;
        
        //Check input
        while (scanInput.hasNext()){
            
            if (scanInput.hasNextInt()){
                
                origPopulation = scanInput.nextInt();
                
                if (origPopulation < 0){
                    
                    int badInputInt = origPopulation;
                    System.out.println("Please re-enter a valid input of the " 
                    + "population: ");
                    
                }
                
                else{
                    break;
                }
                
            }
            
            else{
                
                String badInputStr = scanInput.next();
                System.out.println("Please re-enter a valid input of the " + 
                "population: ");
                
            }
            
        }
        
        //31,536,000 seconds in a year
        int counter = 0;
        int secYear = 31536000;
        int birth = secYear / 7;
        int death = secYear / 13;
        int immigrant = secYear / 45;
        
        System.out.printf("\nYear \t Population\n");
        System.out.println("=====================");
        
        while (counter < 5){
            
            int total = origPopulation + birth - death + immigrant;
            origPopulation = total;
            int year = ++counter;
            //Display Projected Population Growth
            System.out.printf("%d \t %d \n", year, total);
            
        }
        
        
    }//endof main
    
}//end of class