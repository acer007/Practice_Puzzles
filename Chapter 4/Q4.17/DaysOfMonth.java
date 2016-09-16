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
            String[] monthArray = new String[] {"Jan", "Feb", "Mar", "Apr", 
                                                "May", "Jun", "Jul", "Aug", 
                                                "Sep", "Oct", "Nov", "Dec"};
            
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
            
            // Determine Number of Days
            
            int days = 0;
            
            //Leap year
            if (month.equals("Feb")){
                
                if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0))
                    days = 29;
                else
                    days = 28;
            }
            
            // 30-days
            if (month.equals("Apr") || 
                month.equals("Jun") || 
                month.equals("Sep") || 
                month.equals("Nov")){
                days = 30;
            }
            
            // 31-days
            if (month.equals("Jan") || month.equals("Mar") || 
                month.equals("May") || month.equals("Jul") ||
                month.equals("Aug") || month.equals("Oct") ||
                month.equals("Dec")    
            ){
                days = 31;
            }
            
            // Display
            System.out.println("Days: " + days);
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
