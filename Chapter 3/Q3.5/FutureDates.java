// Enter a number corresponding to today's weekday and the number of days 
// elapsed in order to display the future weekday given the number of days 
// elapsed : daysElapsed % 7

import java.util.Scanner;

public class FutureDates{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner and variables
            Scanner scanInput = new Scanner(System.in);
            
            String weekDayStart = "";
            int wds = 0;
            
            String weekdayEnd = "";
            int wde = 0;

            int elapsedDays =  0;
            

            //Prompt input
            System.out.println("Key: \n0 - Sunday \n1 - Monday \n2 - Tuesday" + 
                                "\n3 - Wednesday \n4 - Thursday \n5 = Friday" + 
                                "\n6 = Saturday");
                                
            System.out.println("Enter today's day: ");
            
            //Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    wds = scanInput.nextInt();
                    
                    if (wds < 0 || wds > 6){
                        
                        int badInputInt = wds;
                        System.out.print("\nPlease enter a number between 0 and " + 
                                            "6: ");
                        
                    }
                    
                    else{
                        
                        weekDayStart = weekdayStr(wds);
                        break;
                    }
                    
                }
                
                else{
                    
                    String badInputStr = scanInput.next();
                    System.out.print("\nPlease enter a number between 0 and 6: ");
                    
                }
                
            }//end of while loop
            
            //Prompt input
            System.out.println("Enter the number of days elapsed: ");
            
            //Verify input
            while (scanInput.hasNext()){

                if (scanInput.hasNextInt()){
                    
                    elapsedDays = scanInput.nextInt();
                    
                    if (elapsedDays < 0){
                        int badInputInt = elapsedDays;
                        System.out.print("\nPlease enter a number greater " + 
                                        "than or equal to 0: ");
                    }
                    else
                        break;
                }
                
                else{
                    String badInputStr = scanInput.next();
                    System.out.print("\nPlease enter a number greater than " + 
                                    "or equal to 0: ");
                }
                
            }
            
            //Display
            wde = elapsedDays % 7;
            weekdayEnd = weekdayStr(wde);
            
            System.out.println("Today is " + weekDayStart + " and the future day is " + 
                                weekdayEnd);
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of class
    
    //Method
    
    /* weekdayStr
     * Parameters: int
     * return: String
     */
    public static String weekdayStr(int a){
        
        String output = "";
        
        switch(a){
            
            case 0 : output = "Sunday";
                     break;
    
            case 1: output = "Monday";
                    break;
                    
            case 2: output = "Tuesday";
                    break;
                    
            case 3: output = "Wednesday";
                    break;
                    
            case 4: output = "Thursday";
                    break;
                    
            case 5: output = "Friday";
                    break;
                    
            case 6: output = "Saturday";
                    break;
                    
            default: System.out.println("Error: Invaild random number generated");
                     System.exit(1);
        }
        
        return output;
    }
    
}// end of class