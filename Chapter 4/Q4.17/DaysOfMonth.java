import java.util.Scanner;

public class DaysOfMonth{
    
    public static void main(String args[]){
        
        try{
            
            Scanner scanInput = new Scanner(System.in);
            
            // Enter the year
            System.out.print("Enter the year: ");
            int year = 0;
            
            //Verify Input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    year = scanInput.nextInt();
                    
                    if (year < 0){
                        
                        int badInputInt = year;
                        System.out.println("Re-enter the year " + 
                                    "as a positive whole number: ");
                    }
                    
                    else
                        break;
                    
                }
                
                else{
                    
                    String badInputStr = scanInput.next();
                    System.out.print("Enter the year as a " + 
                                        "whole number: ");
                    
                }
                
            }
            
            // Enter the month
            System.out.print("Enter the month (Ex. Jan, Feb, etc.): ");
            String month = "";
            String[] monthArray = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            
            // Verify Input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNext()){
                    
                    month = scanInput.next();
                    int match = 0;
                    
                    for (int k = 0; k < monthArray.length; k++){
                        
                        if (month.equals(monthArray[k])){
                            match++;
                        }
                        
                    }
                    
                    if (match != 1){
                        String badInputStr = month;
                        System.out.print("Re-enter the month: ");
                    }
                    
                    else
                        break;
                    
                }
                
                else{
                    double badInputDouble = scanInput.nextDouble();
                    System.out.print("Re-enter the month: ");
                }
                
            }
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
